package com.example.poc.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.poc.service.SMCPAsynService;

public class SMCPSchedular {
	
	@Autowired
    private SMCPAsynService checkAsyncService;

    @Scheduled(fixedDelay = 10000)
    public void checkTheScedule() {
        checkAsyncService.printSMCPList();
    }

}
