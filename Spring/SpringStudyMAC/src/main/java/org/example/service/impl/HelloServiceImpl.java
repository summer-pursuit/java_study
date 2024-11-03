package org.example.service.impl;

import org.example.entity.Student;
import org.example.mapper.HelloMapper;
import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    HelloMapper mapper;
    @Override
    public Student findStudentBySid(int sid) {
        return mapper.findStudent(sid);
    }
}
