package com.springCore;

import org.springframework.stereotype.Service;

@Service("pushService")
public class PushNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending Push: " + message);
    }
}
