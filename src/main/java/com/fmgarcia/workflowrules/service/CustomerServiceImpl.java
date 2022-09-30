package com.fmgarcia.workflowrules.service;

import org.springframework.stereotype.Service;

import com.fmgarcia.workflowrules.domain.Customer;
import com.fmgarcia.workflowrules.dtos.CustomerNewResquestDto;
import com.fmgarcia.workflowrules.dtos.CustomerResponseDto;
import com.fmgarcia.workflowrules.exception.NoSuchElementFoundException;
import com.fmgarcia.workflowrules.mapper.CustomerMapper;
import com.fmgarcia.workflowrules.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerMapper mapper;

	private final CustomerRepository customerRepository;

	@Override
	public CustomerResponseDto save(CustomerNewResquestDto requestDTO) {

		Customer customer = mapper.toCustomer(requestDTO);

		Customer newCustomer = customerRepository.save(customer);

		CustomerResponseDto responseDTO = mapper.toCustomerDTO(newCustomer);

		return responseDTO;
	}

	@Override
	public Iterable<CustomerResponseDto> findAll() {
		Iterable<Customer> customers = customerRepository.findAll();

		Iterable<CustomerResponseDto> responseDTOs = mapper.toCustomerDTOs(customers);

		return responseDTOs;
	}

	@Override
	public CustomerResponseDto findById(Long id) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementFoundException(String.format("Item with id %d not found", id)));

		return mapper.toCustomerDTO(customer);

	}

}
