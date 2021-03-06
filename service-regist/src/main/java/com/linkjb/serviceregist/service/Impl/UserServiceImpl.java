package com.linkjb.serviceregist.service.Impl;

import com.linkjb.servicepojo.pojo.user.User;
import com.linkjb.serviceregist.dao.UserDao;
import com.linkjb.serviceregist.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sharkshen
 * @data 2019/1/17 14:35
 * @Useage
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

    @Override
    public Integer RegistUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public User findUserById(String userId) {
        return userDao.findUserById(userId);
    }

    @Override
    public void update(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getUserByEmailAddress(String emailAddress) {
        return userDao.getUserByEmailAddress(emailAddress);
    }
}
