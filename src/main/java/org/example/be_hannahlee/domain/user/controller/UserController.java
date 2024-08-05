package org.example.be_hannahlee.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.be_hannahlee.domain.user.dto.request.UserSignupRequest;
import org.example.be_hannahlee.domain.user.repository.UserRepository;
import org.example.be_hannahlee.domain.user.service.UserSignupService;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserSignupService userSignupService;

    @PostMapping("/signup")
    public void signup(@RequestBody UserSignupRequest request) {
        userSignupService.signup(request);
    }
}
