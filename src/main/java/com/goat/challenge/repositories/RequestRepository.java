package com.goat.challenge.repositories;

import com.goat.challenge.domain.request.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RequestRepository extends JpaRepository<Request, UUID> {
}
