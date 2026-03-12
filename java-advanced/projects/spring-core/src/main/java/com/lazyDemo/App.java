package com.lazyDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Container created");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LazyConfig.class);

        System.out.println("container started");
        LazyBean lazyBean = context.getBean(LazyBean.class);

        lazyBean.start();
        context.close();
    }
}
