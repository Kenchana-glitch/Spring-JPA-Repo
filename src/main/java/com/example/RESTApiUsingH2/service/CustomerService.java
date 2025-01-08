package com.example.RESTApiUsingH2.service;

import java.net.http.HttpResponse;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RESTApiUsingH2.model.Customer;
import com.example.RESTApiUsingH2.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	public Customer addCustomer(Customer customer) {
		repo.save(customer);
		return customer;
	}
	
	public Optional<Customer> getCustomer(String customerId) {
		return repo.findById(customerId);
	}
}
