package dev.cesar.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.cesar.springboot.entities.Customer;
import dev.cesar.springboot.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{
	
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public List<Customer> getAll(){
		return (List<Customer>) repository.findAll();
		}

	@Override
	public Customer getById(Long id) {
		// TODO Auto-generated method stub
		return (Customer)repository.findById(id).get();
	}
	
	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}
	
	@Override
	public void save(Customer customer) {
		repository.save(customer);
	}

}


