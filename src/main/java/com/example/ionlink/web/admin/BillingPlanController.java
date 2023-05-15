package com.example.ionlink.web.admin;

import com.example.ionlink.dao.BillingPlanRepository;
import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.services.admin.BillingPlanService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin")
@Slf4j
public class   BillingPlanController {
    @Autowired
    private BillingPlanService billingPlanService;
    //billing plan controller
    @Autowired
    private BillingPlanRepository billingPlanRepository;

    @RequestMapping(value = {"/home"})
    public String index(){
        return "admin/dashboard";
    }

    @RequestMapping(value = "/billingPlan")
    public String showBillingPlans(){

        return "admin/index";
    }

    @RequestMapping(value = "/billingPlan/{id}")
    public String showBillingPlan(){
        return "admin/index";
    }

    @RequestMapping(value = "/billingPlan/add",method = RequestMethod.GET)
    public String billingPLanCreateForm( Model model, BillingPlan billingPlan){
        model.addAttribute("billingPlan",new BillingPlan());
        return "admin/addBillingPlan";
    }

        @RequestMapping(value = "/billingPlan/new",method = RequestMethod.POST)
        public String billingPLanCreate(Model model, @Valid BillingPlan billingPlan, BindingResult bindingResult){
            System.out.println(billingPlan.customers);
            billingPlanService.CreateBillingPlan(billingPlan);
            model.addAttribute("billingPlan",new BillingPlan());
            return "redirect:admin/addBillingPlan";
        }
    @RequestMapping(value = "/billingPlan/delete",method = RequestMethod.POST)
    public String deleteBillingPLan( Model model, BillingPlan billingPlan){

        return "admin/addBillingPlan";
    }

    @RequestMapping(value = "/billingPlan/edit",method = RequestMethod.POST)
    public String billingPLanEditForm( Model model, BillingPlan billingPlan){

        return "admin/addBillingPlan";
    }
    @RequestMapping(value = "/billingPlan/save",method = RequestMethod.POST)
    public String billingPLanSave( Model model, BillingPlan billingPlan){

        return "admin/addBillingPlan";
    }


}
