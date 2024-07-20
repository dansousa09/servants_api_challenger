package com.goat.challenge.controllers;

import com.goat.challenge.domain.request.Request;
import com.goat.challenge.domain.request.UserSpecializationRequestDTO;
import com.goat.challenge.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    private RequestService service;

    public Request create(@RequestBody UserSpecializationRequestDTO dto) {
        return service.create(dto);
    }
}
