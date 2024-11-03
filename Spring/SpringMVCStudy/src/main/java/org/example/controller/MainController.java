package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "helloworld!!1";
    }
}
