package com.example.datarest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.data.rest.core.annotation.*;

@RepositoryEventHandler
public class UserEventListener {
    private static final Logger logger = LoggerFactory.getLogger(UserEventListener.class);

    @EventListener
    @HandleBeforeCreate
    public void handleAuthorBeforeCreate(User user){
        System.out.println("Inside User Before Create....");
        String name = user.getFirstname();
        user.setFirstname("moke");
    }

    @EventListener
    @HandleAfterCreate
    public void handleAuthorAfterCreate(User user){
        System.out.println("Inside User After Create ....");
        String name = user.getLastname();
        logger.info("Lastname: {}", name);
    }

    @EventListener
    @HandleBeforeDelete
    public void handleAuthorBeforeDelete(User user){
        logger.info("Inside User Before Delete ....");
        String name = user.getLastname();
        logger.info("Lastname: {}", name);
    }

    @EventListener
    @HandleAfterDelete
    public void handleAuthorAfterDelete(User user){
        logger.info("Inside User After Delete ....");
        String name = user.getFirstname();
        logger.info("Firstname: {}", name);
    }
}
