package com.etiya.customerservice.repository;

import com.etiya.customerservice.entity.ContactMedium;
import com.etiya.customerservice.entity.CorporateCustomer;
import com.etiya.customerservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerRepository extends JpaRepository<Customer, Customer> {
}
