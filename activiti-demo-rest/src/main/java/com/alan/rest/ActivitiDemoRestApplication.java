package com.alan.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.activiti.spring.boot.SecurityAutoConfiguration.class,
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class ActivitiDemoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivitiDemoRestApplication.class, args);
    }

}
