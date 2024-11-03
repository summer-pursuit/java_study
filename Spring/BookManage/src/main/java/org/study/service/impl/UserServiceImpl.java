package org.study.service.impl;

import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.study.entity.Account;
import org.study.entity.Student;
import org.study.mapper.UserMapper;
import org.study.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper mapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account=mapper.findUserByName(username);
        if(account==null)
            throw  new UsernameNotFoundException("用户名或密码错误！！");
        return User.withUsername(account.getUsername())
                .password(account.getPassword())
                .roles(account.getRole())
                .build();
    }

    @Override
    public List<Student> getStudentList() {
        return mapper.getStudentList();
    }
}
