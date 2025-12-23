package com.example.consumer.resttemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/resttemplate")
public class RestTemplateController {

    private final RestTemplate restTemplate;

    RestTemplateController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/instance")
    public String getInstance() {

        return restTemplate.getForObject("http://localhost:8081/instance", String.class);

    }
}
