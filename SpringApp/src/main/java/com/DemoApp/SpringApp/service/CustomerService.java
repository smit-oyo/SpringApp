package com.DemoApp.SpringApp.service;

import com.DemoApp.SpringApp.entity.customer;
import com.DemoApp.SpringApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<customer> getinfo(){
        return repository.findAll();
    }

    public customer saveCustomer(customer info){
        return repository.save(info);
    }

    public customer updateCustomer(customer info){
        customer existingCustomer = repository.findById(info.getId()).orElse(null);
        existingCustomer.setFirst_name(info.getFirst_name());
        existingCustomer.setLast_name(info.getLast_name());
        existingCustomer.setAmount(info.getAmount());
        return repository.save(existingCustomer);
    }
}
