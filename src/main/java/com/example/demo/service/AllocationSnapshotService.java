package com.example.demo.service;

import com.example.demo.entity.AllocationSnapshot;
import java.util.List;

public interface AllocationSnapshotService {

    AllocationSnapshot create(AllocationSnapshot snapshot);

    List<AllocationSnapshot> getAll();

    AllocationSnapshot getById(Long id);

    void delete(Long id);
}
