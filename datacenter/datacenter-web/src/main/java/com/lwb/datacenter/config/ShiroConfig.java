package com.lwb.datacenter.config;

import com.lwb.datacenter.realms.JdbcRealm;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liuweibo
 * @date 2018/12/23
 */
@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShiroConfig {

    @Bean
    public Realm realm() {
        return new JdbcRealm();
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        return chainDefinition;
    }

}
