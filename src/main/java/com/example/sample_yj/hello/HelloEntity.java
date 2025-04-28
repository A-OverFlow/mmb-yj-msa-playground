package com.example.sample_yj.hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "hello_collection")
public class HelloEntity {
    @Id
    private String id;

    private LocalDateTime createdAt;

    public HelloEntity() {
    }

    public HelloEntity(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
