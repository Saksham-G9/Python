package com.example.consumer.restclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/rest-client")
public class RestClientController {

    @GetMapping("/instance")
    public String getInstance() {
        RestClient restClient = RestClient.create();
        return restClient.get()
                .uri("http://localhost:8081/instance")
                .retrieve()
                .body(String.class);
    }
}
