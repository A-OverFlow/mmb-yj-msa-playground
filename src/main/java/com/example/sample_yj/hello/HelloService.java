package com.example.sample_yj.hello;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class HelloService {
    private final HelloRepository helloRepository;

    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public HelloEntity saveCurrentTime() {
        HelloEntity entity = new HelloEntity(LocalDateTime.now());
        return helloRepository.save(entity);
    }
}
