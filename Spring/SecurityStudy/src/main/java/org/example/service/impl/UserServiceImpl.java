package org.example.service.impl;

import org.example.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import javax.swing.*;
@Service
public class UserServiceImpl implements UserService {
    @Override
    @PreAuthorize("hasRole('user')")
    public void test() {
        System.out.println("我是服务！1");
    }
}
