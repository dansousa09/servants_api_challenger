package com.goat.challenge.controllers;

import com.goat.challenge.domain.user.User;
import com.goat.challenge.domain.user.UserRequestDTO;
import com.goat.challenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User create(@RequestBody UserRequestDTO dto) {
        return service.create(dto);
    }
}
