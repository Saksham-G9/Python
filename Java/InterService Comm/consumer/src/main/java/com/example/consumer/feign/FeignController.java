package com.example.consumer.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/feign")
@RequiredArgsConstructor
public class FeignController {

    private final ProviderFeignClient providerFeignClient;

    @GetMapping("/instance")
    public String getInstance() {
        return providerFeignClient.getInstanceDetails();

    }
}
