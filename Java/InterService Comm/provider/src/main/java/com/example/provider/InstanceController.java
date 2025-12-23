package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class InstanceController {
    
    private static final Logger logger = LoggerFactory.getLogger(InstanceController.class);

    @Value("${server.port}")
    private String portInfo;
    
    @GetMapping("/instance")
    public String getInstanceInfo() {
        logger.info("Request received for instance info: {}", portInfo);
        return "Instance running on port: " + portInfo;
    }
}
