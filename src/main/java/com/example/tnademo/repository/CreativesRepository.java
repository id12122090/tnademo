package com.example.tnademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tnademo.domain.Creatives;

public interface CreativesRepository extends JpaRepository<Creatives, Long> {

}
