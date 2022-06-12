package com.aditya.notificationservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

public class MessageRequest {
    private String message;
    private String to;

    public MessageRequest(@JsonProperty ("message")String message, @JsonProperty("to") String to) {
        this.message = message;
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
