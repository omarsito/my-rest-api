package com.oabraham.myrestapi.controller;

import com.oabraham.myrestapi.business.CustomerBusiness;
import com.oabraham.myrestapi.entity.Customer;
import com.oabraham.myrestapi.pojo.RootAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/customers")
public class CustomerController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    CustomerBusiness customerBusiness;

    @PostMapping("/add")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer addedCustomer = customerBusiness.addCustomer(customer);
        return ResponseEntity.ok(addedCustomer);
    }

    @GetMapping("/list")
    public ResponseEntity<RootAPI> getCustomers(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RootAPI> getCustomer(){
        return null;
    }

    @PostMapping("/update")
    public ResponseEntity<RootAPI> updateCustomer(){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RootAPI> deleteCustomer(){
        return null;
    }

}