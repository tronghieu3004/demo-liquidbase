package com.utm.springdemo.service;

import com.utm.springdemo.model.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<UserEntity>> getAllUser();
}
