package com.aditya.notificationservice.service.whatsapp;

import com.aditya.notificationservice.config.ApplicationConfigLoad;
import com.aditya.notificationservice.dto.MessageRequest;
import com.aditya.notificationservice.repository.NotificationRepository;
import com.aditya.notificationservice.service.NotificationService;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhatsappService implements NotificationService {

    @Autowired
    NotificationRepository notificationRepository;
    private final ApplicationConfigLoad applicationConfigLoad;

    @Autowired
    public WhatsappService(ApplicationConfigLoad applicationConfigLoad) {
        this.applicationConfigLoad = applicationConfigLoad;
    }

    @Override
    public boolean sendMessage(MessageRequest messageRequest) {
        PhoneNumber from=new PhoneNumber(applicationConfigLoad.getFromNumber());
        PhoneNumber to=new PhoneNumber(messageRequest.getTo());
        String message=messageRequest.getMessage();
        if(isValidPhoneNumber(from,to)) {
            Message.creator(
                    to,
                    from,
                    message
            ).create();
        }
        else
            throw new IllegalArgumentException("Phone number not valid "+ from+"  "+to);

        return true;

    }

    private boolean isValidPhoneNumber(PhoneNumber from, PhoneNumber to) {
        return true;
    }
}
