package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        return new AuthResponse("dummy-token", 1L, request.getEmail(), "INVESTOR");
    }

    @PostMapping("/register")
    public String register() {
        return "User registered";
    }
}
