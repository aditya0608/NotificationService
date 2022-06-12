package com.aditya.notificationservice.service;

import com.aditya.notificationservice.dto.MessageRequest;

public interface NotificationService {

    public boolean sendMessage(MessageRequest messageRequest);
}
