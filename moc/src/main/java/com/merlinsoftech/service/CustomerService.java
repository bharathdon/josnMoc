package com.merlinsoftech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merlinsoftech.DAO.CustomerDao;
import com.merlinsoftech.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public Customer save(Customer customer2) {
		return customerDao.save(customer2);
	}
}
