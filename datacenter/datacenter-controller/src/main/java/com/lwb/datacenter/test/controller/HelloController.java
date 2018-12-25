package com.lwb.datacenter.test.controller;

import com.lwb.datacenter.service.UserService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuweibo
 * @date 2018/12/25
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public Object hello() {
        this.userService.getUserByName("jlj");
        return "hello";
    }

}
