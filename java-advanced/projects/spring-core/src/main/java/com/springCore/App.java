package com.springCore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NotificationManager manager = context.getBean(NotificationManager.class);
        manager.sendEmail("Email notification");
        manager.sendSms("SMS notification");
        manager.sendPush("Push notification");

        context.close();
    }
}
