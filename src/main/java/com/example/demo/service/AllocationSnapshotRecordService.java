package com.example.demo.service;

import com.example.demo.model.AllocationSnapshotRecordModel;
import java.util.List;

public interface AllocationSnapshotRecordService {
    List<AllocationSnapshotRecordModel> getByInvestor(Long investorId);
}
