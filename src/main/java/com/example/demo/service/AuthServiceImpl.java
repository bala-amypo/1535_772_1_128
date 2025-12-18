package com.example.demo.service;

import com.example.demo.model.AuthRequest;
import com.example.demo.model.AuthResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse register(AuthRequest request) {
        return new AuthResponse("User registered successfully");
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        return new AuthResponse("Login successful");
    }
}
