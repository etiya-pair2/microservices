package com.etiya.customerservice.repository;

import com.etiya.customerservice.entity.ContactMedium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMediumRepository extends JpaRepository<ContactMedium,Long> {
}
