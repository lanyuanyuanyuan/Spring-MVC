package com.lanyuanyuan.service.impl;

import com.lanyuanyuan.dao.UserDao;
import com.lanyuanyuan.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;



    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
