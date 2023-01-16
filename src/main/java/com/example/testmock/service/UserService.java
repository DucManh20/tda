package com.example.testmock.service;

import com.example.testmock.entity.User;

import java.util.List;

public interface UserService {

    public User getUserByName(String name);
    public User saveUser(User user);
    public List<User> getAllUsers();
}