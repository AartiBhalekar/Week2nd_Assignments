package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public interface ICustomerService extends CustomerRepository {
	
	List<Customer> findAll();
	Customer save(Customer customer);

}
