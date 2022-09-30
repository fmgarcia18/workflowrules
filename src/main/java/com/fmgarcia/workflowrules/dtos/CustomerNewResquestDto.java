package com.fmgarcia.workflowrules.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class CustomerNewResquestDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3060146898119920545L;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private String email;

	@NotEmpty
	private String phone;

}
