package com.goat.challenge.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncryptService {
    private final BCryptPasswordEncoder encoder;

    public EncryptService() {
        encoder = new BCryptPasswordEncoder();
    }

    public String encrypt(String value) {
        return this.encoder.encode(value);
    }

    public boolean validate(String raw, String encoded) {
        return this.encoder.matches(raw, encoded);
    }
}
