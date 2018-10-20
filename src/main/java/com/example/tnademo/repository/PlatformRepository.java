package com.example.tnademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tnademo.domain.Platforms;

public interface PlatformRepository extends JpaRepository<Platforms, Long> {

}