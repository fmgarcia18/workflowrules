package com.fmgarcia.workflowrules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmgarcia.workflowrules.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
