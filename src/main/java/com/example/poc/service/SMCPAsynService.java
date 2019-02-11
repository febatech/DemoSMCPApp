package com.example.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.poc.persistance.SMCPProfile;
import com.example.poc.persistance.SMCPProfileRepository;
import com.example.poc.thread.SMCPThread;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Service
public class SMCPAsynService {
	
	@Autowired 
	private SMCPProfileRepository smcpProfileRepo;
	
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private TaskExecutor taskExecutor;
    
    @PersistenceContext
    private EntityManager entityManager;

    public void executeSMCPAsyn() {

        taskExecutor.execute(new Runnable() {

            @Override
            public void run() {

                //TODO Implementation is yet to be done for this logic 
                SMCPThread smcpThread = applicationContext.getBean(SMCPThread.class);
                taskExecutor.execute(smcpThread);
            }

        });

    }

    @Async
    @Transactional
	public void printSMCPList() {
    	 List<SMCPProfile> employees = entityManager.createQuery("SELECT e FROM SMCP_Profile e").getResultList();
    	 employees.stream().forEach(e->System.out.println("Name :  "+e.getName()+" Version :  "+e.getVersion()));
		
	}
    
    
    public List<SMCPProfile> getSMCPProfileByName(String name){
    	return smcpProfileRepo.getByName(name);
    }
}
