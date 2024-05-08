package edu.icet.crm.controller;

import edu.icet.crm.model.Customer;
import edu.icet.crm.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;

    @PostMapping("/customer")
    Customer persist(@RequestBody Customer customer){
        return customerService.persist(customer);
    }

    @GetMapping("/customer")
    List<Customer> retrive(){
        return customerService.retrive();
    }
}
