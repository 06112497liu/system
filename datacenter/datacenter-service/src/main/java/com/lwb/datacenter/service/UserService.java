package com.lwb.datacenter.service;

import com.lwb.entity.User;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
public interface UserService {

    User getUserByName(String username);
}
