package com.restapp.restapp.controller;

import com.restapp.restapp.model.User;
import com.restapp.restapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class USerController {
    @Autowired(required=true)
    UserService userService;

    @PostMapping(path = "/save")
    public User save(@RequestBody User user){
        return userService.saveUser(user);

    }
    @GetMapping(path = "/getUserById")
    public User get(@RequestParam Long id){
        return userService.getUserById(id);
    }

    @GetMapping(path = "/getAllUser")
    public List<User> get(){
        return userService.getAllUser();
    }

    @PostMapping
    public int update(){
        return 0;
    }
    @DeleteMapping(path = "/delete")
    public int delete(){
        return 0;
    }

}
