package com.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private final NotificationService emailService;
    private final NotificationService smsService;
    private final NotificationService pushService;

    @Autowired
    public NotificationManager(
            @Qualifier("emailService") NotificationService emailService,
            @Qualifier("smsService") NotificationService smsService,
            @Qualifier("pushService") NotificationService pushService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;
    }

    public void sendEmail(String message) {
        emailService.send(message);
    }

    public void sendSms(String message) {
        smsService.send(message);
    }

    public void sendPush(String message) {
        pushService.send(message);
    }
}
