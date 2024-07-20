package com.goat.challenge.repositories;

import com.goat.challenge.domain.specialization.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpecializationRepository extends JpaRepository<Specialization, UUID> {
}
