package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse register(AuthRequest request) {
        return new AuthResponse("Registered: " + request.getEmail());
    }

    @Override
    public AuthResponse login(AuthRequest request) {
        return new AuthResponse("Logged in: " + request.getEmail());
    }
}
