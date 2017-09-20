package me.zyly.riska.manage.controller;

import lombok.Data;
import me.zyly.riska.core.domain.Admin;
import me.zyly.riska.core.repository.AdminRepository;
import me.zyly.riska.manage.Constants;
import org.hibernate.validator.constraints.NotBlank;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;

/**
 * Created by hanzhe on 2017/7/19.
 */
@RequestMapping("/")
@RestController
public class CascadeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CascadeController.class);
    private @Autowired AdminRepository adminRepository;

    @RequestMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public void login(@RequestBody @Valid LoginBean loginBean, HttpSession session) {
        LOGGER.info("login request: {}", loginBean);
        String securePass = DigestUtils.md5DigestAsHex((loginBean.getPassword() + Constants.LOGIN_PASS_SECURE_KEY).getBytes());
        Admin admin = adminRepository.findByLoginNameAndPassword(loginBean.getName(), securePass);
        if(null == admin) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        admin.setLastLoginTime(new Date());
        admin.setLoginTimes(admin.getLoginTimes() + 1);
        adminRepository.save(admin);
        session.setAttribute(Constants.SESSION_KEY, admin);
    }
    @SuppressWarnings("WeakerAccess")
    @Data
    public static class LoginBean {
        @NotBlank
        private String name;
        @NotBlank
        private String password;
    }
}
