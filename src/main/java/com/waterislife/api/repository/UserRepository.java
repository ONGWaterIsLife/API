package com.waterislife.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.waterislife.api.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);
}
