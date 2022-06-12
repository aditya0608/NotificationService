package com.aditya.notificationservice.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ChannelType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String channelCode;
    private String channelDesc;
    @ManyToMany(targetEntity = User.class)
    private List<User> users;

    public ChannelType(String channelCode, String channelDesc) {
        this.channelCode = channelCode;
        this.channelDesc = channelDesc;
    }

    public ChannelType() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
