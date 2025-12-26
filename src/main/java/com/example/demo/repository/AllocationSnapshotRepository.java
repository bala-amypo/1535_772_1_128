package com.example.demo.repository;

import com.example.demo.entity.AllocationSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationSnapshotRepository
        extends JpaRepository<AllocationSnapshot, Long> {
}
