package com.example.demo.repository;

import com.example.demo.entity.InvestorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorProfileRepository
        extends JpaRepository<InvestorProfile, Long> {
}
