package com.lwb.datacenter.dao;

import com.lwb.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
public interface UserDao {

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    User get(@Param("username") String username);

}
