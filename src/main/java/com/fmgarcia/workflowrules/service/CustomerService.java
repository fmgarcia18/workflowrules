package com.fmgarcia.workflowrules.service;

import com.fmgarcia.workflowrules.dtos.CustomerNewResquestDto;
import com.fmgarcia.workflowrules.dtos.CustomerResponseDto;

public interface CustomerService {

	CustomerResponseDto save(CustomerNewResquestDto requestDTO);

	Iterable<CustomerResponseDto> findAll();

	CustomerResponseDto findById(Long id);

}
