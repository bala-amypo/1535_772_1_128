package com.example.demo.service;

import com.example.demo.entity.RebalancingAlert;
import java.util.List;

public interface RebalancingAlertService {

    RebalancingAlert create(RebalancingAlert alert);

    List<RebalancingAlert> getAll();

    RebalancingAlert getById(Long id);

    RebalancingAlert update(Long id, RebalancingAlert alert);

    void delete(Long id);

    void evaluate(Long id); // core logic
}
