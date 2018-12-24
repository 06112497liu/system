package com.lwb.config;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuweibo
 * @date 2018/12/23
 */
@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShiroConfig {

    @Autowired
    SecurityManager securityManager;

}
