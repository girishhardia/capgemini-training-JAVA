package com.springCore;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
