package org.example.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Data

public class User {
    String username;
    String password;
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
}
