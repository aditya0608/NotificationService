package com.aditya.notificationservice.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String Name;
    private String emailId;
    private String userId;
    @ManyToMany(targetEntity = ChannelType.class)
    private List<ChannelType> channels;

    @ManyToMany(targetEntity = Notification.class)
    private List<Notification> notifications;

    public User(String name, String emailId, String userId) {
        Name = name;
        this.emailId = emailId;
        this.userId = userId;
    }

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<ChannelType> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelType> channels) {
        this.channels = channels;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
