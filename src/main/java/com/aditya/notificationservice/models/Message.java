package com.aditya.notificationservice.models;

import javax.persistence.*;

@Entity
public class Message {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long messageId;
    private String message;
    private long expiryDate;
    @ManyToOne
    @JoinColumn(name = "notificationId")
    private Notification notification;



}
