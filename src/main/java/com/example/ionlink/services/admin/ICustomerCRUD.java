package com.example.ionlink.services.admin;

import com.example.ionlink.entities.Customer;

import java.util.List;

public interface ICustomerCRUD {
    public void createCustomer(Customer customer);
    public List<Customer> getAllCustomers();
    public void editCustomer();
    public Customer showCustomer(Long id);

}
