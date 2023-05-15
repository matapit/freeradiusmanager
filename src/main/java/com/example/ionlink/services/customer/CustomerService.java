package com.example.ionlink.services.customer;



import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Customer;

import java.util.List;

public interface CustomerService {
    public void SubcribeOffert(Long billingPlanId);
    public List<BillingPlan> getAllOfferts();
    public void registration(Customer customer);
}
