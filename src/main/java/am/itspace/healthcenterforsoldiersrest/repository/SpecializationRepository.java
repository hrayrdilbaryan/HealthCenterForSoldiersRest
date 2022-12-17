package com.example.healthcenterforsoldiers.repository;

import com.example.healthcenterforsoldiers.entity.Specialization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecializationRepository extends JpaRepository<Specialization, Integer> {
}
