package com.lwb.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    /**
     * 用户名
     */
    String username;

    /**
     * 密码
     */
    String password;


}
