package com.example.sample_yj.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

    private final HelloService helloService;
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello() {
        HelloEntity savedEntity = helloService.saveCurrentTime();
        log.info("🕒 [GET] /hello called");
        return "Current time: " + savedEntity.getCreatedAt();
    }
}