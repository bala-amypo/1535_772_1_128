package com.example.demo.service;

import com.example.demo.model.RebalancingAlertRecordModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RebalancingAlertRecordServiceImpl
        implements RebalancingAlertRecordService {

    @Override
    public List<RebalancingAlertRecordModel> getByInvestor(Long investorId) {
        return new ArrayList<>();
    }

    @Override
    public RebalancingAlertRecordModel resolve(Long id) {
        RebalancingAlertRecordModel model = new RebalancingAlertRecordModel();
        model.setId(id);
        model.setResolved(true);
        return model;
    }
}
