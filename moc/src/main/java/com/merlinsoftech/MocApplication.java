package com.merlinsoftech;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.merlinsoftech.model.Customer;
import com.merlinsoftech.service.CustomerService;

@SpringBootApplication
public class MocApplication {

	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(MocApplication.class, args);

	}

	@PostConstruct
	public void init() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Customer[] customer = objectMapper.readValue(new File("F:\\customer.json"), Customer[].class);

		for (Customer customer2 : customer) {
			customerService.save(customer2);
			
		}
		

		System.out.println(customer);

	}

}
