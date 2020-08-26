package com.merlinsoftech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.merlinsoftech.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	Customer save(Customer[] customer);

}
