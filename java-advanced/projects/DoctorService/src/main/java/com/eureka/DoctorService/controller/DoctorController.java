package com.eureka.DoctorService.controller;

import com.eureka.DoctorService.client.UserClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoctorController {

//    private final RestTemplate restTemplate;
//
//    public DoctorController(RestTemplate restTemplate){
//        this.restTemplate = restTemplate;
//    }
    private final UserClient userClient;

    public DoctorController(UserClient userClient) {
        this.userClient = userClient;
    }


    @GetMapping("/doctor")
    public String getDoctor(){
//        String users = restTemplate.getForObject("http://USER-SERVICE/users", String.class);
        String users = userClient.getUsers();
        return  "Doctors Fetched. Also Calling -> " + users;
    }
}
