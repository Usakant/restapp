package com.restapp.restapp.service;


import com.restapp.restapp.dao.USerRepository;
import com.restapp.restapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")

public class UserServiceImplementation implements UserService {

    @Autowired
    USerRepository uSerRepository;

    @Override
    public User saveUser(User user) {
        return uSerRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return uSerRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUser() {
        return (List<User>) uSerRepository.findAll();
    }
}
