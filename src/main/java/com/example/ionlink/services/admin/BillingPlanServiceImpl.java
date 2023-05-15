package com.example.ionlink.services.admin;

import com.example.ionlink.dao.BillingPlanRepository;
import com.example.ionlink.dao.RadgroupcheckRepository;
import com.example.ionlink.dao.RadgroupreplyRepository;
import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Radgroupcheck;
import com.example.ionlink.entities.Radgroupreply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingPlanServiceImpl implements BillingPlanService{
    @Autowired
    private BillingPlanRepository billingPlanRepository;
    @Autowired
    private RadgroupcheckRepository radgroupcheckRepository;
    @Autowired
    private RadgroupreplyRepository radgroupreplyRepository;

    @Override
    public void CreateBillingPlan(BillingPlan billingPlan) {
        BillingPlan billingPlan1 = billingPlanRepository.save(billingPlan);

        Radgroupreply radgroupreply = new Radgroupreply(billingPlan,"pfSense-Bandwidth-Max-Up",":=",String.valueOf(billingPlan.getBandwhithUp()));
        System.out.println(radgroupreply.getAttribute());
        radgroupreplyRepository.save(radgroupreply);
        radgroupreplyRepository.save( new Radgroupreply(billingPlan,"pfSense-Bandwidth-Max-Down",":=",String.valueOf(billingPlan.getBandwhidthdown())));


    }

    @Override
    public void AddBillingPlan(BillingPlan billingPlan) {

    }

    @Override
    public void deleteBillingPlan(BillingPlan billingPlan) {

    }

    @Override
    public List<BillingPlan> getAllBillingPlan() {
        return null;
    }

    @Override
    public BillingPlan getBillingPlan(String label) {
        return null;
    }

    @Override
    public void editBillingPlan(Long id, BillingPlan billingPlan) {

    }
}
