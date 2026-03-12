package com.eureka.UserService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/user")
    public String getUsers(){
        return "users fetched from USER-SERVICE running on port: " + port;
    }
}

