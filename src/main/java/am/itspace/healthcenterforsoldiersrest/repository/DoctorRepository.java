package com.example.healthcenterforsoldiers.repository;

import com.example.healthcenterforsoldiers.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
