package com.sell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@Component
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverTEndpointExporter() {
        return new ServerEndpointExporter();
    }

}
