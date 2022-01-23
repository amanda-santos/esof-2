package com.example.springdockerproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springdockerproject.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	List<Customer> findBySurname(String surname);
	
	Customer findById(int id);
}
