package com.example.poc.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class SMCPThread implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(SMCPThread.class);

    @Override
    public void run() {

        LOGGER.info("Logic to be implemented");
    }
}