package com.restapp.restapp.service;

import com.restapp.restapp.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public User getUserById(Long id);
    public List<User> getAllUser();
}
