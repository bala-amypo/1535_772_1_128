package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.repository.HoldingRecordRepository;
import com.example.demo.service.HoldingRecordService;

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
    public void delete(String investorId) {
        repository.deleteById(id); // 🔥 Long → Long (NO ERROR)
    }
}
