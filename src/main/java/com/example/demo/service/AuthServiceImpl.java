package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String username, String password) {
        return "LOGIN_SUCCESS";
    }

    @Override
    public String register(String username, String password) {
        return "REGISTER_SUCCESS";
    }
}
