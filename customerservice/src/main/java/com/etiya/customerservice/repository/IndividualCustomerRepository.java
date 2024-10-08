package com.etiya.customerservice.repository;

import com.etiya.customerservice.entity.CorporateCustomer;
import com.etiya.customerservice.entity.Customer;
import com.etiya.customerservice.entity.IndividualCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerRepository extends JpaRepository<Customer, Customer> {
}
