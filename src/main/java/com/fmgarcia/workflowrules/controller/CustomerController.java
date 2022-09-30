package com.fmgarcia.workflowrules.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmgarcia.workflowrules.dtos.CustomerNewResquestDto;
import com.fmgarcia.workflowrules.dtos.CustomerResponseDto;
import com.fmgarcia.workflowrules.service.CustomerService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

	private final CustomerService customerService;

	@GetMapping
	public ResponseEntity<Iterable<CustomerResponseDto>> getAllCustomers() {

		Iterable<CustomerResponseDto> customers = customerService.findAll();

		return ResponseEntity.status(HttpStatus.OK).body(customers);
	}

	@PostMapping
	public ResponseEntity<CustomerResponseDto> saveCustomer(@Valid @RequestBody CustomerNewResquestDto request) {

		log.info(request.toString());

		CustomerResponseDto customer = customerService.save(request);

		return ResponseEntity.status(HttpStatus.OK).body(customer);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponseDto> findById(@PathVariable Long id) {
		CustomerResponseDto customer = customerService.findById(id);

		return ResponseEntity.status(HttpStatus.OK).body(customer);
	}

}
