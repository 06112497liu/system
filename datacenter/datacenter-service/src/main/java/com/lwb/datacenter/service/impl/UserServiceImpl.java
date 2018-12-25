package com.lwb.datacenter.service.impl;

import com.lwb.datacenter.dao.UserDao;
import com.lwb.datacenter.service.UserService;
import com.lwb.entity.User;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
@FieldDefaults(level = AccessLevel.PRIVATE)
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public User getUserByName(String username) {
        return this.userDao.get(username);
    }
}
