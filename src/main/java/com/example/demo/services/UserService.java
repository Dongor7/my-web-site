package com.example.demo.services;


import com.example.demo.domain.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
