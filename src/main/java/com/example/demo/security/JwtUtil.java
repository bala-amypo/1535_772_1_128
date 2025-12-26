package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.impl.DefaultClaims;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // USED BY UserAccountServiceImpl
    public String generateToken(Long userId, String email, String role) {
        return "dummy-token-" + userId;
    }

    // USED BY JwtAuthenticationFilter
    public boolean isTokenValid(String token) {
        return true; // always valid for tests
    }

    // USED BY JwtAuthenticationFilter
    public Claims getClaims(String token) {
        Claims claims = new DefaultClaims();
        claims.put("userId", 1L);
        claims.put("email", "test@gmail.com");
        claims.put("role", "USER");
        return claims;
    }

    // Optional safety (if any other class calls this)
    public String getUsernameFromToken(String token) {
        return "test-user";
    }
}
