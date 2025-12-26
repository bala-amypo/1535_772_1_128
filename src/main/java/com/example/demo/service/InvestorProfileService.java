package com.example.demo.service;

import com.example.demo.entity.InvestorProfile;

import java.util.List;
import java.util.Optional;

public interface InvestorProfileService {

    InvestorProfile createInvestor(InvestorProfile investor);

    InvestorProfile getInvestorById(String id);

    List<InvestorProfile> getAllInvestors();

    InvestorProfile updateInvestorStatus(String id, boolean active);

    Optional<InvestorProfile> findByInvestorId(String investorId);
}
