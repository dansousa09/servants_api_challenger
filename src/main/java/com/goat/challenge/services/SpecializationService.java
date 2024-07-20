package com.goat.challenge.services;

import com.goat.challenge.domain.specialization.Specialization;
import com.goat.challenge.domain.specialization.SpecializationRequestDTO;
import com.goat.challenge.repositories.SpecializationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpecializationService {
    @Autowired
    private SpecializationRepository repository;

    public Specialization create(SpecializationRequestDTO dto) {
        Specialization specialization = new Specialization();
        specialization.setName(dto.name());

        return repository.save(specialization);
    }
}
