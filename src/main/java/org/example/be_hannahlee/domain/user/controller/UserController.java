package org.example.be_hannahlee.domain.user.controller;

import lombok.RequiredArgsConstructor;
import org.example.be_hannahlee.domain.user.dto.request.UserSignupRequest;
import org.example.be_hannahlee.domain.user.service.UserSignupService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserSignupService userSignupService;

    @ResponseStatus(HttpStatus.CREATED) //를 넣어주자
    @PostMapping("/signup")
    public void signup(@RequestBody UserSignupRequest request) {
        userSignupService.signup(request);
    }
}
