package com.merlinsoftech.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.merlinsoftech.model.Customer;
import com.merlinsoftech.repository.CustomerRepository;

@Repository
public class CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer save(Customer customer2) {
		return customerRepository.save(customer2);
	}
}
