package org.example.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.example.mapper.UserMapper;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RegisterController {
    @Resource
    JavaMailSender sender;

    @PostMapping("/code")
    public String getCode(@RequestParam String email,
                          HttpSession session){
        Random random=new Random();
        int code=random.nextInt(900000)+ 100000;
        session.setAttribute("code",code);
        session.setAttribute("email",email);
        SimpleMailMessage message=new SimpleMailMessage();
        message.setSubject("你的验证码");
        message.setText("验证码是"+code+"有效时间三分钟，请妥善保管！");
        message.setTo(email);
        //邮件发送者，这里要与配置文件中的保持一致
        message.setFrom("13687616857@163.com");
        //OK，万事俱备只欠发送
        sender.send(message);
        return "发送成功";
    }

    @Resource
    UserMapper mapper;
    @PostMapping("/register")
    public String register(@RequestParam  String username,
                           @RequestParam String email,
                           @RequestParam int code,
                           @RequestParam String password,
                           HttpSession session){
        Integer sessionCode=(Integer) session.getAttribute("code");
        String sessionEmail=(String) session.getAttribute("email").toString();
        if(sessionCode==null) return "请先获取验证码";
        if (sessionCode !=code) return "验证码不正确";
        if(!sessionEmail.equals(email)) return "请先获取验证码";
        mapper.createUser(username,email,password);
        return "注册成功！！";


    }


}
