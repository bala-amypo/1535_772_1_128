package com.example.demo.controller;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.repository.InvestorProfileRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/investors")
public class InvestorProfileController {

    private final InvestorProfileRepository repo;

    public InvestorProfileController(InvestorProfileRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public InvestorProfile create(@RequestBody InvestorProfile investor) {
        investor.setActive(true);
        return repo.save(investor);
    }
}
