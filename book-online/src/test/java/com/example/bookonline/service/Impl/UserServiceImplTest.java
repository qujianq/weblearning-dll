package com.example.bookonline.service.Impl;

import com.example.bookonline.service.UserService;
import org.junit.jupiter.api.Test;

class UserServiceImplTest {
    private UserService userService = new UserServiceImpl();

    @Test
    void signIn() {
        userService.signIn("Account3","123456");
    }
}