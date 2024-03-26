package com.oabraham.myrestapi.repo;

import com.oabraham.myrestapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {}
