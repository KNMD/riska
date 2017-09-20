package me.zyly.riska.manage.controller;

import me.zyly.riska.core.domain.Admin;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hanzhe on 2017/7/21.
 */
@RestController
@RequestMapping("/users")
public class UserController extends BaseLoginedCRUDController<Admin> {

//    private @Autowired AdminRepository usersRepository;
//
//    @PostMapping("/{id}")
//    public void u(@PathVariable String id, @RequestBody Admin users) {
//        u(id, users, "id", "password", "createTime", "lastLoginTime", "loginTimes");
//    }
//
//    @GetMapping("/checkLoginName/{loginName}")
//    public void checkLoginName(@PathVariable String loginName) {
//        if(StringUtils.isEmpty(loginName)) {
//            throw new HttpClientErrorException(BAD_REQUEST);
//        }
//        Admin users = usersRepository.findByLoginName(loginName);
//        if(null != users) {
//            throw new HttpClientErrorException(CONFLICT);
//        }
//    }
}
