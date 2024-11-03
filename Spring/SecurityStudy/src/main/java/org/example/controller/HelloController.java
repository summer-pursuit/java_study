package org.example.controller;

import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.http.HttpSession;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    UserService service;

    @PreAuthorize("hasAnyRole('user','admin')")
    @GetMapping("/")
    public String index(){
        service.test();
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
