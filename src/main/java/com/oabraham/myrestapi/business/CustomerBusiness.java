package com.oabraham.myrestapi.business;

import com.oabraham.myrestapi.dao.CustomerDao;
import com.oabraham.myrestapi.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerBusiness {

    @Autowired
    CustomerDao customerDao;
    public Customer addCustomer(Customer customer){
        return customerDao.addCustomer(customer);
    }
}
