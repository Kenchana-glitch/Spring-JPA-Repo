package com.example.RESTApiUsingH2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RESTApiUsingH2.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
