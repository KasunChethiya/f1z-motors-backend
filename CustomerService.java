package edu.icet.crm.service;

import edu.icet.crm.model.Customer;

import java.util.List;

public interface CustomerService {
    public Customer persist(Customer customer);

    List<Customer> retrive();
}
