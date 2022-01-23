package com.example.springdockerproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdockerproject.model.Customer;
import com.example.springdockerproject.repository.CustomerRepository;

// @Component
@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> createCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		List<Customer> savedCustomers = new ArrayList<Customer>();
		
		customers.add(new Customer("Amanda", "Santos"));
		customers.add(new Customer("João", "Silva"));
		customers.add(new Customer("Maria", "Rocha"));
		customers.add(new Customer("Carlos", "José"));
		customers.add(new Customer("Ana", "Lúcia"));
		
		Iterable<Customer> itrCustomers = repository.saveAll(customers);
		itrCustomers.forEach(savedCustomers::add);
		
		return savedCustomers;
	}
	
	public Customer retrieveCustomer(Integer customerId) {
		return repository.findById(customerId).orElse(new Customer());
	}
}
