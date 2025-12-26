package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse register(AuthRequest request) {
        return new AuthResponse(
                request.getUsername(),
                "USER",
                "Registered successfully"
        );
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        return new AuthResponse(
                request.getUsername(),
                "USER",
                "Login successful"
        );
    }
}
