package com.example.ionlink.dao;

import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
