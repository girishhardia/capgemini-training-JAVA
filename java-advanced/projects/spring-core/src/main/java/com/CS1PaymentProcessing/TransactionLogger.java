package com.CS1PaymentProcessing;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TransactionLogger {

    @PostConstruct
    public void init(){
        System.out.println("Logger initiated");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Logger destroyed");
    }

    public void log(String message) {
        System.out.println("Transaction Log: " + message);
    }
}
