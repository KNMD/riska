package me.zyly.riska.manage.controller;

import lombok.Getter;
import lombok.Setter;
import me.zyly.riska.manage.domain.DataTableResp;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

/**
 * Created by hanzhe on 2017/7/21.
 */
public class BaseLoginedCRUDController<T> extends LoginedController{

    private @Autowired PagingAndSortingRepository<T, String> pagingAndSortingRepository;

    private @Getter @Setter String updateIgnoreFields;

    @RequestMapping("/list")
    public Iterable<T> list() {
        return pagingAndSortingRepository.findAll();
    }

    @RequestMapping("/page")
    public Page<T> page(@PageableDefault Pageable pageable) {
        return pagingAndSortingRepository.findAll(pageable);
    }

    @RequestMapping("/page/for/dataTable")
    public DataTableResp<T> pageForDataTable(@PageableDefault(sort = { "createTime" }, direction = Sort.Direction.DESC) Pageable pageable,
                        @RequestParam(required = false, defaultValue = "0") int start) {
        int page = start > 0 ? start / pageable.getPageSize() : start;
        PageRequest pageRequest = new PageRequest(page, pageable.getPageSize(), pageable.getSort());
        return new DataTableResp<>(page(pageRequest));
    }

    @PutMapping(value = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public void c(@RequestBody T t) {
        pagingAndSortingRepository.save(t);
    }

    @GetMapping("/{id}")
    public T r(@PathVariable String id) {
        T t = pagingAndSortingRepository.findOne(id);
        if(null == t) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        return t;
    }

    @PostMapping("/{id}")
    public void u(@PathVariable String id, @RequestBody T t) {
        u(id, t, null);
    }

    public void u(String id,T t, String... ignoreProperties) {
        T data = r(id);
        BeanUtils.copyProperties(t, data, ignoreProperties);
        pagingAndSortingRepository.save(data);
    }

    @DeleteMapping("/{id}")
    public void d(@PathVariable String id) {
        T t = r(id);
        pagingAndSortingRepository.delete(t);
    }

}
