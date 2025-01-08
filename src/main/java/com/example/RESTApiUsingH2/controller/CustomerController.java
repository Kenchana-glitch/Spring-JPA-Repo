package com.example.RESTApiUsingH2.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTApiUsingH2.model.Customer;
import com.example.RESTApiUsingH2.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/api/v1/account/{customerNumber}")
	public Optional<Customer> getCustomer(@PathVariable String customerNumber){
		return service.getCustomer(customerNumber);
	}
	
	@PostMapping("/api/v1/account")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
		
	}
}
