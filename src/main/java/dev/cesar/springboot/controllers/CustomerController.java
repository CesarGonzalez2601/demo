package dev.cesar.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.cesar.springboot.entities.Customer;
import dev.cesar.springboot.services.CustomerService;
import dev.cesar.springboot.services.ICustomerService;

@RestController
public class CustomerController {

	@Autowired
	private ICustomerService service;
	
	@GetMapping("/api/customers")
	public List<Customer> getAll(){

		return service.getAll();
	}
	
	@GetMapping("/api/customers/{id}")
	public Customer get(@PathVariable String id){

		return service.getById(Long.parseLong(id));
	}
	
	@DeleteMapping("/api/customers/{id}")
	public void remove(@PathVariable String id) {
		service.remove(Long.parseLong(id));
	}
	
	@PostMapping("/api/customers")
	public void save(@RequestBody Customer customer) {
		service.save(customer);
	}
}
