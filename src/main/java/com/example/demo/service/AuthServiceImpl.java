package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    public AuthResponse register(AuthRequest request) {
        return new AuthResponse("dummy-token");
    }

    public AuthResponse login(AuthRequest request) {
        return new AuthResponse("dummy-token");
    }
}
