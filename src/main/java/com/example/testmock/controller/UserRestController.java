package com.example.testmock.controller;

import com.example.testmock.entity.User;
import com.example.testmock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{username}")
    public User getUserByName(@PathVariable String username) {
        return userService.getUserByName(username);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}