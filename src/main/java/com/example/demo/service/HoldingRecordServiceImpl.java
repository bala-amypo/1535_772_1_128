package com.example.demo.service.impl;

import com.example.demo.entity.HoldingRecord;
import com.example.demo.repository.HoldingRecordRepository;
import com.example.demo.service.HoldingRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoldingRecordServiceImpl implements HoldingRecordService {

    private final HoldingRecordRepository repository;

    public HoldingRecordServiceImpl(HoldingRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public HoldingRecord create(HoldingRecord record) {
        return repository.save(record);
    }

    @Override
    public List<HoldingRecord> getAll() {
        return repository.findAll();
    }

    @Override
    public HoldingRecord getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Holding not found"));
    }

    @Override
    public HoldingRecord update(Long id, HoldingRecord record) {
        HoldingRecord existing = getById(id);

        existing.setAssetName(record.getAssetName());
        existing.setQuantity(record.getQuantity());
        existing.setPrice(record.getPrice());
        existing.setActive(record.getActive());

        return repository.save(existing);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
