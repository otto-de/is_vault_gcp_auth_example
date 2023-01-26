package com.ottogroup.esb.examples.vaultgcpauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class DummySecretHandler {

    //Injection of the vault secret with key mySuperStrongSecret => spring cloud vault has this in its properties after initialisation of spring cloud vault
    @Value("${mySuperStrongSecret}")
    private String secret;


    Logger logger = LoggerFactory.getLogger(DummySecretHandler.class);

    @EventListener(ContextRefreshedEvent.class)
    public void processSecret(){
        //Log the Secret in application log (not the best way to handle secrets, but for demo purpose its good enough :-) )
        logger.info("i can use this secret from vault: {}",secret);
    }
}
