package com.example.healthcenterforsoldiers.repository;

import com.example.healthcenterforsoldiers.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
