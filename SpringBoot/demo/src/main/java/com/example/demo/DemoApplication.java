package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication  {  //继承专用的初始化器
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//
//    //重写configure方法，完成启动类配置
//    @Override
//    protected SpringApplicationBuilder configure(Sprin
//                                                             gApplicationBuilder builder) {
//        return builder.sources(DemoApplication.class);
//    }
}
