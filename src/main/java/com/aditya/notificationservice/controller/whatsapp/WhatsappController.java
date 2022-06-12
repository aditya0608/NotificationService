package com.aditya.notificationservice.controller.whatsapp;


import com.aditya.notificationservice.dto.MessageRequest;
import com.aditya.notificationservice.service.whatsapp.WhatsappService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/notification/whatsapp")
public class WhatsappController {

    @Autowired
    WhatsappService whatsappService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody MessageRequest messageRequest)
    {
        whatsappService.sendMessage(messageRequest);
        return "Message Sent success";
    }

    public void setWhatsappService(WhatsappService whatsappService) {
        this.whatsappService = whatsappService;
    }
}
