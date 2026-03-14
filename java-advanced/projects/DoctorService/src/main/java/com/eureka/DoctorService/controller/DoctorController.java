package com.eureka.DoctorService.controller;

import com.eureka.DoctorService.client.UserClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
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
    @CircuitBreaker(name="userService", fallbackMethod = "userFallback")
    public String getDoctor(){
//        String users = restTemplate.getForObject("http://USER-SERVICE/users", String.class);
        String users = userClient.getUsers();
        return  "Doctors Fetched. Also Calling -> " + users;
    }
    public  String userFallback(Throwable ex){
        return "user service is currently unavailable. showing doctor data currently";
    }

    @GetMapping("doctor/config")
    public String getConfig(@Value("$doctor.service.message") String message, @Value("db.password") String dbPass){
        return  message + "| DB " +dbPass;
    }
}
