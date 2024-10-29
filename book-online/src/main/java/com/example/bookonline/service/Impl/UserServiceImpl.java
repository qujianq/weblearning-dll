package com.example.bookonline.service.Impl;

import com.example.bookonline.dao.Impl.UserDaoImpl;
import com.example.bookonline.dao.UserDao;
import com.example.bookonline.entity.User;
import com.example.bookonline.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    @Override
    public User signIn(String account, String password) {
        User user = User.builder().account(account).password(password).build();
        return userDao.findUser(user);
    }

    @Override
    public int register(String account, String password) {
        User user = User.builder().account(account).password(password).build();
        return userDao.insertUser(user);
    }

    @Override
    public int updataImage(String account, String avatar) {
        return userDao.updataImage(account,avatar);
    }

    @Override
    public User userInfo(String account) {
        return userDao.userInfo(account);
    }


}
