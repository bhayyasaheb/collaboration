package com.sbkchat.collaboration.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
@ComponentScan(basePackages = "com.sbkchat.collaboration")
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	private static final Logger log = LoggerFactory.getLogger(WebSocketConfig.class);
	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		
		log.debug("starting of the method configureMessageBroker");
		config.enableSimpleBroker("/topic");
		config.setApplicationDestinationPrefixes("/app");
		log.debug("Ending of the method configureMessageBroker");
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		
		log.debug("Starting of the method registerStompEndpoints");
		registry.addEndpoint("/chat").setAllowedOrigins("*").withSockJS();
		log.debug("Ending of the method registerStompEndpoints");
	}

}
