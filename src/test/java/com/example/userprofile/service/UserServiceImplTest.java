package com.example.userprofile.service;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private DisplayService userService;


    @BeforeEach
    void setUp() {
        userService = new DisplayServiceImpl();

    }


}