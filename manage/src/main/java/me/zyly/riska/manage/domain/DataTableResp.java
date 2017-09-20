package me.zyly.riska.manage.domain;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by hanzhe on 2017/7/22.
 */
@Data
public class DataTableResp<T> {
    private long recordsTotal;
    private long recordsFiltered;
    private List<T> data;
    public DataTableResp(Page<T> page) {
        this.data = page.getContent();
        this.recordsTotal = page.getTotalElements();
        this.recordsFiltered = page.getTotalElements();
    }
}
