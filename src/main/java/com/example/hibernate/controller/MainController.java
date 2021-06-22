package com.example.hibernate.controller;

import com.example.hibernate.entity.User;
import com.example.hibernate.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p></p>
 *
 * @author : lon
 * @date : 2021-06-22 16:00
 **/
@RestController
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping(path = "/add")
    public String addNewUser(@RequestParam String name) {
        User user = new User();
        user.setName(name);
        userRepository.save(user);
        return "Saved.";
    }


    @GetMapping(path = "/all")
    public  Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/find")
    public  User getAllUsers(@RequestParam String name) {
        return userRepository.findNameHql(name);
    }

}
