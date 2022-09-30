package com.fmgarcia.workflowrules.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmgarcia.workflowrules.dtos.CustomerNewResquestDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping
	public ResponseEntity<String> getAllCustomers() {

		return ResponseEntity.status(HttpStatus.OK).body("Get all customers");
	}

	@PostMapping
	public ResponseEntity<String> saveCustomer(@Valid @RequestBody CustomerNewResquestDto request) {

		log.info(request.toString());

		return ResponseEntity.status(HttpStatus.OK).body("Save customer");
	}

}
