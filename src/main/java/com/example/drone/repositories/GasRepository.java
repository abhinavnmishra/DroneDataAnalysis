package com.example.drone.repositories;

import com.example.drone.models.GasValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GasRepository extends JpaRepository<GasValue, Integer> {
}