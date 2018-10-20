package com.example.tnademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tnademo.domain.TargetAudiance;

public interface TargetAudianceRepository extends JpaRepository<TargetAudiance, Long> {

}
