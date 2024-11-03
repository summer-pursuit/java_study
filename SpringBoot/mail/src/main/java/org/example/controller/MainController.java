package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.example.entity.Account;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Validated
@Controller
@Tag(name = "账户验证相关", description = "包括用户登录、注册、验证码请求等操作。")
public class MainController {

    @ResponseBody
    @Operation(description = "用户登录接口",summary = "请求用户数据测试接口")
    @PostMapping("/submit")
    public String submit(@Parameter(description = "测试文本数据", example = "KFCvivo50")@RequestParam String name,
                         @Parameter(description = "测试文本数据", example = "KFCvivo50")@RequestParam String password){
//        System.out.println(username.substring(3));
//        System.out.println(password.substring(2, 10));
        return "请求成功!";
    }


}
