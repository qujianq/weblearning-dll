package com.example.bookonline.service;

import com.example.bookonline.entity.User;

public interface UserService {
    /**
     * 用户登录功能
     *
     * @param account  账号
     * @param password 密码
     * @return user
     */
    User signIn(String account, String password);

    int register(String account, String password);

    int updataImage(String account,String avatar);

    User userInfo(String account);

//    User register(String,)
}
