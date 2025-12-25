package com.example.demo.service;

import com.example.demo.entity.InvestorProfile;

public interface InvestorProfileService {
    InvestorProfile create(InvestorProfile investor);
    InvestorProfile get(Long id);
}
