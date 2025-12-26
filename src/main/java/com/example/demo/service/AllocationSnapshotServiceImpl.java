package com.example.demo.service.impl;

import com.example.demo.entity.AllocationSnapshot;
import com.example.demo.repository.AllocationSnapshotRepository;
import com.example.demo.service.AllocationSnapshotService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AllocationSnapshotServiceImpl
        implements AllocationSnapshotService {

    private final AllocationSnapshotRepository repository;

    public AllocationSnapshotServiceImpl(
            AllocationSnapshotRepository repository) {
        this.repository = repository;
    }

    @Override
    public AllocationSnapshot create(AllocationSnapshot snapshot) {
        snapshot.setSnapshotTime(LocalDateTime.now());
        return repository.save(snapshot);
    }

    @Override
    public List<AllocationSnapshot> getAll() {
        return repository.findAll();
    }

    @Override
    public AllocationSnapshot getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Snapshot not found"));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
