package com.example.ionlink.web;

import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Customer;
import com.example.ionlink.services.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerPagesControllers {

    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "/home")
    public String index(){
        return "customer/index";
    }

    @RequestMapping(value = "/offers")
    public String offers(Model model){
        List<BillingPlan> billingPlans= customerService.getAllOfferts();
        model.addAttribute("billingPlans", billingPlans);
        return "customer/offertSuscription";
    }
    @RequestMapping(value = "/subscribe/{id}")
    public String subscribe(Model model, @PathVariable long id){
        customerService.SubcribeOffert(id);
        return "customer/offertSuscription";
    }
    @RequestMapping(value = "/registry")
    public String subscribe(Model model){
        model.addAttribute("customer",new Customer());
        return "customer/registry";

    }
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public String billingPLanCreate( Customer customer){
        System.out.println("hbvqsdkjndkl");
        System.out.println(customer.getPassword());
        customerService.registration(customer);

        return "redirect:/offers";
    }
}

