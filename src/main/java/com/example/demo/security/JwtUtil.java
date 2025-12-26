package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    public String generateToken(Long userId, String email, String role) {
        return "dummy-token-" + userId;
    }

    public boolean isTokenValid(String token) {
        return true;
    }

    public Claims getClaims(String token) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", 1L);
        claims.put("email", "test@gmail.com");
        claims.put("role", "USER");
        return Jwts.claims(claims);
    }

    public String getUsernameFromToken(String token) {
        return "test";
    }
}
