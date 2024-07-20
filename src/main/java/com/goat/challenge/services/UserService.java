package com.goat.challenge.services;

import com.goat.challenge.domain.user.User;
import com.goat.challenge.domain.user.UserRequestDTO;
import com.goat.challenge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private EncryptService encryptService;

    @Autowired
    private UserRepository userRepository;

    public User create(UserRequestDTO dto) {
        User user = new User();
        user.setName(dto.name());
        user.setEmail(dto.email());

        String encodedPassword = encryptService.encrypt(dto.password());
        user.setPassword(encodedPassword);

        return userRepository.save(user);
    }
}
