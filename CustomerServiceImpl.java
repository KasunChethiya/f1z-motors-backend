package edu.icet.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.entity.CustomerEntity;
import edu.icet.crm.model.Customer;
import edu.icet.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repository;
    @Autowired
    ObjectMapper mapper;
    public Customer persist(Customer customer){


        CustomerEntity savedProduct = repository.save(
                mapper.convertValue(
                        customer, CustomerEntity.class));

        return mapper.convertValue(savedProduct,Customer.class);
    }

    public List<Customer> retrive(){

        Iterable<CustomerEntity> productList = repository.findAll();
        List<Customer> productModels = new ArrayList<>();

        productList.forEach(productEntity -> {
            productModels.add(
                    mapper.convertValue(productEntity, Customer.class));

        });
        return productModels;


    }
}