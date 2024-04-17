package dev.cesar.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.cesar.springboot.entities.Supplier;
import dev.cesar.springboot.repository.SupplierRepository;

@Service
public class SupplierService implements ISupplierService{
	
	@Autowired
	private SupplierRepository repository;
	
	@Override
	public List<Supplier> getAll(){
		return (List<Supplier>) repository.findAll();
		}

	@Override
	public Supplier getById(Long id) {
		// TODO Auto-generated method stub
		return (Supplier)repository.findById(id).get();
	}
	
	@Override
	public void remove(Long id) {
		repository.deleteById(id);
	}
	
	@Override
	public void save(Supplier supplier) {
		repository.save(supplier);
	}

}