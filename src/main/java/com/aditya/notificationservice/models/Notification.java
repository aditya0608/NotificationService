package com.aditya.notificationservice.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long notificationId;
    @OneToMany(mappedBy = "notification")
    private List<Message> message;
    @ManyToMany(targetEntity = User.class)
    private List<User> users;

}
