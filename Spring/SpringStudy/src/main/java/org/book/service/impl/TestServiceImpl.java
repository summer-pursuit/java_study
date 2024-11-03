package org.book.service.impl;

import jakarta.annotation.Resource;
import org.book.mapper.TestMapper;
import org.book.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    TestMapper mapper;

    @Override
    @Transactional   //此注解表示事务，之后执行的所有方法都会在同一个事务中执行
    public void test() {
        System.out.println("我是业务方法！！！");
        mapper.insertStudent();
        if(true) throw new RuntimeException("我是测试异常！");
        mapper.insertStudent();
    }
}
