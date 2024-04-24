package com.utm.springdemo.service.impl;

import com.utm.springdemo.model.UserEntity;
import com.utm.springdemo.repository.UserRepository;
import com.utm.springdemo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public ResponseEntity<List<UserEntity>> getAllUser() {
        List<UserEntity> userList = userRepository.findAll();
        return new ResponseEntity<List<UserEntity>>(userList, HttpStatus.OK);
    }
}
