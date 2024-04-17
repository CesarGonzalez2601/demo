package dev.cesar.springboot.services;

import java.util.List;

import dev.cesar.springboot.entities.Customer;

public interface ICustomerService {

	 List<Customer> getAll();

	 Customer getById(Long id);
	
	 void remove(Long id);
	 
	 void save(Customer customer);
	
}
