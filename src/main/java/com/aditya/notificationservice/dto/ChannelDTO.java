package com.aditya.notificationservice.dto;

public class ChannelDTO {


    private  String channelDesc;
    private  String channelCode;

    public ChannelDTO(String channelDesc, String channelCode) {
        this.channelDesc = channelDesc;
        this.channelCode = channelCode;
    }

    public ChannelDTO() {
    }

    public String getChannelDesc() {
        return channelDesc;
    }

    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
}
