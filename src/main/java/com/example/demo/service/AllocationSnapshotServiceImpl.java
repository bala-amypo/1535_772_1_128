package com.example.demo.service;

import com.example.demo.entity.AllocationSnapshotRecord;
import com.example.demo.repository.AllocationSnapshotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationSnapshotServiceImpl implements AllocationSnapshotService {

    private final AllocationSnapshotRepository repo;

    public AllocationSnapshotServiceImpl(AllocationSnapshotRepository repo) {
        this.repo = repo;
    }

    @Override
    public AllocationSnapshotRecord save(AllocationSnapshotRecord record) {
        return repo.save(record);
    }

    @Override
    public List<AllocationSnapshotRecord> getByInvestorId(String investorId) {
        return repo.findByInvestorId(investorId);
    }
}
