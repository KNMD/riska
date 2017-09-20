package me.zyly.riska.manage.controller;

import me.zyly.riska.core.domain.Admin;
import me.zyly.riska.manage.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.HttpClientErrorException;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by hanzhe on 2017/7/21.
 */
public abstract class LoginedController {
    @ModelAttribute
    public void checkLogin(HttpServletRequest request) {
        Admin admin = (Admin) request.getSession().getAttribute(Constants.SESSION_KEY);
        if(null == admin) {
            throw new HttpClientErrorException(HttpStatus.FORBIDDEN);
        }
    }
}
