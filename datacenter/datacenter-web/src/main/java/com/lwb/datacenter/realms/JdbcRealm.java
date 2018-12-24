package com.lwb.datacenter.realms;

import com.lwb.core.utils.SpringUtil;
import com.lwb.datacenter.service.UserService;
import com.lwb.entity.User;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.Objects;

/**
 * @author liuweibo
 * @date 2018/12/24
 */
public class JdbcRealm extends AuthorizingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        UserService userService = SpringUtil.getBean(UserService.class);
        User user = userService.get(token.getUsername());
        if (Objects.isNull(user)) {
            throw new RuntimeException("用户名不存在");
        }
        return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), this.getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
