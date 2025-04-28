package com.example.sample_yj.hello;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HelloRepository extends MongoRepository<HelloEntity, String> {
}
