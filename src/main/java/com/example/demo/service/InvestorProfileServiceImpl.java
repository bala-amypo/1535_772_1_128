package com.example.demo.service.impl;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.InvestorProfileRepository;
import com.example.demo.service.InvestorProfileService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InvestorProfileServiceImpl implements InvestorProfileService {

    private final InvestorProfileRepository repository;

    public InvestorProfileServiceImpl(InvestorProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public InvestorProfile save(InvestorProfile investor) {
        return repository.save(investor);
    }

    @Override
    public InvestorProfile getById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Investor not found: " + id));
    }

    @Override
    public Optional<InvestorProfile> getByInvestorId(String investorId) {
        return repository.findByInvestorId(investorId);
    }

    @Override
    public List<InvestorProfile> getAll() {
        return repository.findAll();
    }

    @Override
    public InvestorProfile update(String id, InvestorProfile investor) {
        InvestorProfile existing = getById(id);
        existing.setFullName(investor.getFullName());
        existing.setEmail(investor.getEmail());
        existing.setActive(investor.getActive());
        return repository.save(existing);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
