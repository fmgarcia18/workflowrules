package com.fmgarcia.workflowrules.service;

import java.util.Optional;

import com.fmgarcia.workflowrules.domain.Customer;

public interface CustomerService {

	Customer save(Customer customer);

	Iterable<Customer> findAll();

	Optional<Customer> findById(Long id);

}
