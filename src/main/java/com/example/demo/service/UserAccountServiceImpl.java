package com.example.demo.service.impl;

import com.example.demo.entity.enums.RoleType;
import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;


import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserAccountServiceImpl(UserAccountRepository repository,
                                  PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
public AuthResponse login(AuthRequest request) {
    UserAccount user = repo.findByEmail(request.getEmail())
            .orElseThrow(() -> new RuntimeException("User not found"));

    return new AuthResponse(
            "dummy-token",
            user.getId(),
            user.getEmail(),
            user.getRole().name()
    );
}


    @Override
    public void register(RegisterRequest request) {
        UserAccount user = new UserAccount();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(RoleType.valueOf(request.getRole().toUpperCase()));

        user.setActive(true);

        repository.save(user);

        
    }

}
