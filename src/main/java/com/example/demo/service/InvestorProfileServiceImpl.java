package com.example.demo.service.impl;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.repository.InvestorProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class InvestorProfileServiceImpl implements InvestorProfileService {

    private final InvestorProfileRepository repo;

    public InvestorProfileServiceImpl(InvestorProfileRepository repo) {
        this.repo = repo;
    }

    public InvestorProfile create(InvestorProfile investor) {
        return repo.save(investor);
    }

    public InvestorProfile get(Long id) {
        return repo.findById(id).orElseThrow();
    }
}
