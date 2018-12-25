package com.lwb.datacenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuweibo
 * @date 2018/12/23
 */
@SpringBootApplication(scanBasePackages = "com.lwb")
@MapperScan(basePackages = "com.lwb.datacenter.dao")
public class DatacenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatacenterApplication.class, args);
    }
}
