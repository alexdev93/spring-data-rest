package com.example.datarest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration{

    public RepositoryConfiguration(){
        super();
    }

    @Bean
    UserEventListener userEventListener() {
        return new UserEventListener();
    }

}