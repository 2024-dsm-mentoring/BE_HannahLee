package org.example.be_hannahlee.domain.user.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.be_hannahlee.domain.user.dto.request.UserSignupRequest;
import org.example.be_hannahlee.domain.user.entity.User;
import org.example.be_hannahlee.domain.user.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSignupService {
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;

    @Transactional
    public void signup(UserSignupRequest request) {
            userRepository.save(
                    User.builder()
                            .accountId(request.getAccountId())
                            .password(encoder.encode(request.getPassword()))
                            .build()
            );
    }
}