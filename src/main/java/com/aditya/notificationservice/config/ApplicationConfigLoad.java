package com.aditya.notificationservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="whatsapp")
public class ApplicationConfigLoad {

    private  String fromNumber;
    private String toNumber;
    private String authToken;
    private String accountSid;

    public ApplicationConfigLoad() {
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    @Override
    public String toString() {
        return "ApplicationConfigLoad{" +
                "fromNumber='" + fromNumber + '\'' +
                ", toNumber='" + toNumber + '\'' +
                ", authToken='" + authToken + '\'' +
                ", accountSid='" + accountSid + '\'' +
                '}';
    }
}
