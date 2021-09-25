package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService iCustomerService;
	
	@GetMapping("/")
	public List<Customer> findAll(){
		return iCustomerService.findAll();
	}
	
	@PostMapping("/create")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return iCustomerService.save(customer);
	}

}
