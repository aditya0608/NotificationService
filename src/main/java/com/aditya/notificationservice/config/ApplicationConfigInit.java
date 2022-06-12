package com.aditya.notificationservice.config;


import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ApplicationConfigInit {

    private final ApplicationConfigLoad applicationConfigLoad;
    private final static Logger logger= LoggerFactory.getLogger(ApplicationConfigInit.class);
    @Autowired
    public ApplicationConfigInit(ApplicationConfigLoad applicationConfigLoad) {
        this.applicationConfigLoad = applicationConfigLoad;
        logger.info("Properties Loaded {}",applicationConfigLoad.getAccountSid());
        logger.info("Properties Loaded {}",applicationConfigLoad.getAuthToken());
        logger.info("Properties Loaded {}",applicationConfigLoad.getFromNumber());
        logger.info("Properties Loaded {}",applicationConfigLoad.getToNumber());


        Twilio.init(applicationConfigLoad.getAccountSid(),
                    applicationConfigLoad.getAuthToken());
        logger.info("Properties Loaded ",applicationConfigLoad.getAccountSid());
    }
}
