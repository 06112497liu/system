package com.lwb.datacenter.authentication.controller;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuweibo
 * @date 2018/12/25
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/authentication")
@RestController
public class LoginController {

    @PostMapping("/login")
    public Object login(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken(username, password));
        return "登录成功了吗？";
    }
}
