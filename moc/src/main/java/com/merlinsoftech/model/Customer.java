package com.merlinsoftech.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	private Long id;
	private String name;
	private String email;
	private String phone;
	private Integer age;
	private String[] projects;
	@Embedded
	private Address address;
	@Embedded
	private PaymentMethods paymentMethods;
	@Embedded
	private ProfileInfo profileInfo;
	
}
