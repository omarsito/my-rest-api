package com.oabraham.myrestapi.dao;

import com.oabraham.myrestapi.entity.Customer;
import com.oabraham.myrestapi.repo.ICustomerRepository;

public class CustomerDao {

    private final ICustomerRepository customerRepository;

    CustomerDao(ICustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

}
