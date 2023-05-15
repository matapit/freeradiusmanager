package com.example.ionlink;

import com.example.ionlink.dao.BillingPlanRepository;
import com.example.ionlink.dao.CustomerRepository;
import com.example.ionlink.entities.BillingPlan;
import com.example.ionlink.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  IonlinkApplication {


    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(IonlinkApplication.class, args);

        //CustomerRepository customerRepository= ctx.getBean(CustomerRepository.class);
        //customerRepository.save(new Customer("cedric","cedric","cedric","cedric","cedric","cedric",22,"cedric","c4de7df1bafd6d9b8f5d35d4328c93b0","admin",true));

    }

}
