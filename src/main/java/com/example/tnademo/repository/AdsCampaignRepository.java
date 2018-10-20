package com.example.tnademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tnademo.domain.AdsCampaign;

@Repository
public interface AdsCampaignRepository extends JpaRepository<AdsCampaign, Long> {

}
