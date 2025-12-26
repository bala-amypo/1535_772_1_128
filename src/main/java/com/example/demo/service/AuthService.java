package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;


public interface AuthService {
    String register(String username, String password);
    String login(String username, String password);
}
