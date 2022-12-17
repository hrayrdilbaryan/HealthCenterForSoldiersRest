package com.example.healthcenterforsoldiers.repository;

import com.example.healthcenterforsoldiers.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Integer> {
}
