package com.noaa.ghcn.ghcnbrowser.config;

import com.noaa.ghcn.ghcnbrowser.service.MessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageHandlerConfig {

    @Bean
    public MessageHandler messageHandler() {
        return new MessageHandler();
    }
}
