package com.example.ionlink.services.customer;

import com.example.ionlink.dao.BillingPlanRepository;
import com.example.ionlink.dao.CustomerRepository;
import com.example.ionlink.dao.RadcheckRepository;
import com.example.ionlink.dao.RadusergroupRepository;
import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Customer;
import com.example.ionlink.entities.Radcheck;
import com.example.ionlink.entities.Radusergroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BillingPlanRepository billingPlanRepository;
    @Autowired
    private RadusergroupRepository radusergroupRepository;
    @Autowired
    private RadcheckRepository radcheckRepository;
    public static Long idCustomer;
    @Override
    public void SubcribeOffert(Long billingPlanId) {
        long id = 1;
        Optional<Customer> customer = customerRepository.findById(idCustomer);
        Optional<BillingPlan> billingPlan = billingPlanRepository.findById(billingPlanId);
        System.out.println(customer.get().getUsername());
        System.out.println(customer.get().getUsername());

        radusergroupRepository.delete(radusergroupRepository.findByUsernameAndGroupname(customer.get().getUsername(),"daloRADIUS-Disabled-Users"));

        radusergroupRepository.save(new Radusergroup(customer.get().getUsername(),billingPlan.get().getLabel(),billingPlan.get().getPriority()));

    }

    @Override
    public List<BillingPlan> getAllOfferts() {
        List<BillingPlan> billingPlans= billingPlanRepository.findAll();
        return billingPlans;
    }

    @Override
    public void registration(Customer customer) {
        customer.setActive(true);
        customer.setRole("user");
        customer = customerRepository.save(customer);
        radcheckRepository.save(new Radcheck(customer.getUsername(), "Cleartext-Password", ":=",customer.getPassword()));

        Radusergroup radusergroup = radusergroupRepository.save(new Radusergroup(customer.getUsername(), "daloRADIUS-Disabled-Users", 5));
        System.out.println(radusergroup.getUsername());
        idCustomer = customer.getId();
    }
}
