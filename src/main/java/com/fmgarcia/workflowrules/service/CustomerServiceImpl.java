package com.fmgarcia.workflowrules.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fmgarcia.workflowrules.domain.Customer;
import com.fmgarcia.workflowrules.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

}
