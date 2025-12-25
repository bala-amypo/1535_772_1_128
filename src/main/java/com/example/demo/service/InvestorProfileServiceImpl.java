package com.example.demo.service;

import com.example.demo.entity.InvestorProfile;
import com.example.demo.repository.InvestorProfileRepository;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorProfileServiceImpl implements InvestorProfileService {

    private final InvestorProfileRepository repo;

    public InvestorProfileServiceImpl(InvestorProfileRepository repo) {
        this.repo = repo;
    }

    @Override
    public InvestorProfile save(InvestorProfile investor) {
        return repo.save(investor);
    }

    @Override
    public InvestorProfile getByInvestorId(String investorId) {
        return repo.findByInvestorId(investorId)
                .orElseThrow(() -> new ResourceNotFoundException("Investor not found"));
    }

    @Override
    public List<InvestorProfile> getAll() {
        return repo.findAll();
    }

    @Override
    public InvestorProfile update(Long id, InvestorProfile investor) {
        InvestorProfile existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Investor not found"));
        existing.setName(investor.getName());
        existing.setEmail(investor.getEmail());
        existing.setActive(investor.getActive());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
