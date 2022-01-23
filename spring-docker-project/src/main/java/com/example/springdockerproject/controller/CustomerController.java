package com.example.springdockerproject.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.springdockerproject.model.Customer;
import com.example.springdockerproject.service.CustomerService;
import com.google.gson.Gson;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers/create")
	public ResponseEntity<String>createCustomer() {
		List<Customer> customer = customerService.createCustomer();
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
		ResponseEntity<Object> header = ResponseEntity.created(location).build();
		String status = header.getStatusCode().toString();
		String body = new Gson().toJson(customer);
		return ResponseEntity.created(location).header("Status Code", status).body(body);
	}
	
	@GetMapping("customers/{customerId}")
	@ResponseBody
	public ResponseEntity<String> retrieveCustomer(@PathVariable Integer customerId) {
		Customer customer = customerService.retrieveCustomer(customerId);
		String body = new Gson().toJson(customer);
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
}
