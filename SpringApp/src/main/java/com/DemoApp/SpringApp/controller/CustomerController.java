package com.DemoApp.SpringApp.controller;

import com.DemoApp.SpringApp.entity.customer;
import com.DemoApp.SpringApp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customers")
    public List<customer> findAllCustomer(){
        return service.getinfo();
    }

    @PostMapping("/addcustomer")
    public customer addCustomer(@RequestBody customer info) {
        return service.saveCustomer(info);
    }

    @PutMapping("/update")
    public customer updateCustomer(@RequestBody customer info){
        return service.updateCustomer(info);
    }
}
