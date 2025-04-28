package com.example.sample_yj.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello() {
        HelloEntity savedEntity = helloService.saveCurrentTime();
        return "Current time: " + savedEntity.getCreatedAt();
    }
}