package com.example.mongodb_demo.repository;

import com.example.mongodb_demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
