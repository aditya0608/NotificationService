package com.aditya.notificationservice.dto;

public class UserDTO {

    private String userId;
    private String name;
    private String emailId;


    public UserDTO() {
    }

    public UserDTO(String userId, String name, String emailId) {
        this.userId = userId;
        this.name = name;
        this.emailId = emailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
