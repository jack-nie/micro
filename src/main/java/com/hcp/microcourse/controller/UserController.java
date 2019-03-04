package com.hcp.microcourse.controller;

import java.util.List;

import com.hcp.microcourse.domain.UserMapper;
import com.hcp.microcourse.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users")
    List<User> all() {
        return  userMapper.findAll();
    }

    @PostMapping("/users")
    User create(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {
        return userMapper.findById(id);
    }
}