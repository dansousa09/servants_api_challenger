package com.goat.challenge.controllers;

import com.goat.challenge.domain.specialization.Specialization;
import com.goat.challenge.domain.specialization.SpecializationRequestDTO;
import com.goat.challenge.services.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/specializations")
public class SpecializationController {

    @Autowired
    private SpecializationService service;

    @PostMapping
    public Specialization create(@RequestBody SpecializationRequestDTO dto) {
        return service.create(dto);
    }
}
