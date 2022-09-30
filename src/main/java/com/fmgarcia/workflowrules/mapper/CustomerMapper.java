package com.fmgarcia.workflowrules.mapper;

import org.mapstruct.Mapper;

import com.fmgarcia.workflowrules.domain.Customer;
import com.fmgarcia.workflowrules.dtos.CustomerNewResquestDto;
import com.fmgarcia.workflowrules.dtos.CustomerResponseDto;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

	Customer toCustomer(CustomerNewResquestDto requestDTO);

	CustomerResponseDto toCustomerDTO(Customer customer);

	Iterable<CustomerResponseDto> toCustomerDTOs(Iterable<Customer> customer);

}
