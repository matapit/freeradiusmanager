package com.example.ionlink.services.admin;

import com.example.ionlink.entities.BillingPlan;

import java.util.List;

public interface BillingPlanService {
    public void CreateBillingPlan(BillingPlan billingPlan);
    public void AddBillingPlan(BillingPlan billingPlan);
    public void deleteBillingPlan(BillingPlan billingPlan);
    public List<BillingPlan> getAllBillingPlan();
    public BillingPlan getBillingPlan(String label);
    public void editBillingPlan(Long id, BillingPlan billingPlan);

}
