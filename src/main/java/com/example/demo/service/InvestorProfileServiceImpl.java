package com.example.demo.service.impl;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.repository.InvestorProfileRepository;
import com.example.demo.service.InvestorProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorProfileServiceImpl implements InvestorProfileService {

    private final InvestorProfileRepository repository;

    public InvestorProfileServiceImpl(InvestorProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public InvestorProfile create(InvestorProfile investor) {
        return repository.save(investor);
    }

    @Override
    public List<InvestorProfile> getAll() {
        return repository.findAll();
    }

    @Override
    public InvestorProfile getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Investor not found"));
    }

    @Override
    public InvestorProfile update(Long id, InvestorProfile investor) {
        InvestorProfile existing = getById(id);

        existing.setFullName(investor.getFullName());
        existing.setEmail(investor.getEmail());
        existing.setActive(investor.getActive());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
