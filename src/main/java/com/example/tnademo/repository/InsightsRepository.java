package com.example.tnademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tnademo.domain.Insights;

public interface InsightsRepository extends JpaRepository<Insights, Long> {

}
