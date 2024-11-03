package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
public class Student {
    int sid;
    String name;
    String sex;
}
