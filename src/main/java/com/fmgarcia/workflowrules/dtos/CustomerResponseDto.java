package com.fmgarcia.workflowrules.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3060146898119920545L;

	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private String phone;

}
