package com.cloud.haran.ccjavawebapp;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
