package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Controller
public class TestController {

    @GetMapping("/")
    @ResponseBody
    public String hello(HttpSession session){
//        MDC.put("reqID",session.getId());
        log.info("访问了依次测试接口");
        return "hello world!!11";
    }



//    @PostConstruct
//    public  void init(){
//        Logger logger= LoggerFactory.getLogger("test");
//        logger.info("我是slf4j日志信息");
//    }


//    @ResponseBody
//    @GetMapping("/")
//    public String index(){
//        return "borrow";
//    }
//
//    @GetMapping("/login")
//    public String login(){
//
//
//        return "login";
//    }
//
//    @ResponseBody
//    @GetMapping("/test")
//    public User test(){
//        return mapper.findUserById(1);
//    }
}
