package com.utm.springdemo.controller;

import com.utm.springdemo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    final private UserService userService;
    @GetMapping("/all")
    public ResponseEntity<?> getAllUser(){
        return userService.getAllUser();
    }
}
