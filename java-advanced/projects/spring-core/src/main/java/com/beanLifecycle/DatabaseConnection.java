package com.beanLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    public DatabaseConnection(){
        System.out.println("DB constructor is been called!!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Init method is being called");
    }

    public  void executeQuery(){
        System.out.println("Query is being executed");
        System.out.println("select * from students");
    }

    @PreDestroy
    public  void destroy(){
        System.out.println("Destroy method is being called before Object Destruction");
    }
}
