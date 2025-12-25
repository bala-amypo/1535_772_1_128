package com.example.demo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        // demo user (replace with DB later)
        return new User(
                username,
                "$2a$10$7sWZ7dZ6qY9bN6gR4J6VweWZQzU6s5zEJ0pG7q4xH1P9Z1HnEwzQO", 
                Collections.emptyList()
        );
    }
}
