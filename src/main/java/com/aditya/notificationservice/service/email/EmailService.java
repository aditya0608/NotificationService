package com.aditya.notificationservice.service.email;

import com.aditya.notificationservice.dto.MessageRequest;
import com.aditya.notificationservice.repository.NotificationRepository;
import com.aditya.notificationservice.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailService implements NotificationService {
    @Autowired
    NotificationRepository notificationRepository;
    @Override
    public boolean sendMessage(MessageRequest messageRequest) {
        return false;
    }
}
