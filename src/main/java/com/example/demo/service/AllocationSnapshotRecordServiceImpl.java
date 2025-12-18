package com.example.demo.service;

import com.example.demo.model.AllocationSnapshotRecordModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AllocationSnapshotRecordServiceImpl
        implements AllocationSnapshotRecordService {

    @Override
    public List<AllocationSnapshotRecordModel> getByInvestor(Long investorId) {
        return new ArrayList<>();
    }
}
