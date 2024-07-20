package com.goat.challenge.services;

import com.goat.challenge.domain.request.Request;
import com.goat.challenge.domain.request.UserSpecializationRequestDTO;
import com.goat.challenge.domain.specialization.Specialization;
import com.goat.challenge.domain.user.User;
import com.goat.challenge.repositories.RequestRepository;
import com.goat.challenge.repositories.SpecializationRepository;
import com.goat.challenge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RequestService {
    @Autowired
    private RequestRepository repository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SpecializationRepository specializationRepository;

    public Request create(UserSpecializationRequestDTO dto) {
        Request request = new Request();

        User user = userRepository.findById(dto.userId()).orElseThrow();
        Specialization specialization = specializationRepository.findById(dto.specializationId()).orElseThrow();

        request.setUser(user);
        request.setSpecialization(specialization);
        request.setCreatedAt(LocalDateTime.now());

        return repository.save(request);
    }
}
