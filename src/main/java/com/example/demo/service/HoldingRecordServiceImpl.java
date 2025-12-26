package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.repository.HoldingRecordRepository;

@Service
public class HoldingRecordServiceImpl implements HoldingRecordService {

    private final HoldingRecordRepository repository;

    public HoldingRecordServiceImpl(HoldingRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public HoldingRecord save(HoldingRecord record) {
        return repository.save(record);
    }

    @Override
    public List<HoldingRecord> getByInvestorId(String investorId) {
        return repository.findByInvestorId(investorId);
    }

    @Override
    public List<HoldingRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id); // 🔥 THIS IS THE FIX
    }
}
