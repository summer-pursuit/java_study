package org.example.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Hidden
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
