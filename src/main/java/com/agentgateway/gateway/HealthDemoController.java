package com.agentgateway.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Agent Gateway!";
    }
}