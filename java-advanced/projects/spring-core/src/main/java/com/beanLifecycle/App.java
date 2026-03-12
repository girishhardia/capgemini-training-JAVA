package com.beanLifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Container starting");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(beanLifecycleConfig.class);

        System.out.println("Using bean");
        DatabaseConnection dbConnection = context.getBean(DatabaseConnection.class);
        dbConnection.executeQuery();

        System.out.println("closing context");
        context.close();
    }
}
