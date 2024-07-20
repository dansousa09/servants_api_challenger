package com.goat.challenge.domain.request;

import java.util.UUID;

public record UserSpecializationRequestDTO(UUID userId, UUID specializationId) {
}
