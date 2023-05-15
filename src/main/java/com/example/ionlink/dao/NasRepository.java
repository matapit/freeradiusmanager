package com.example.ionlink.dao;

import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Nas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NasRepository extends JpaRepository<Nas, Long> {
}
