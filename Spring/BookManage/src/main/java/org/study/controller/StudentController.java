package org.study.controller;

import jakarta.annotation.Resource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.study.service.UserService;

import java.util.Map;

@Controller
public class StudentController {
    @Resource
    UserService service;
    @GetMapping("/students")
    public  String student(Model model){
        User user= (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("nickname",user.getUsername());
        model.addAttribute("student_list",service.getStudentList());

        return "students";
    }
}
