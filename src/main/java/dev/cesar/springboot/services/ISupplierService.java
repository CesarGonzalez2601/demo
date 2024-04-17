package dev.cesar.springboot.services;

import java.util.List;

import dev.cesar.springboot.entities.Supplier;

public interface ISupplierService {

	 List<Supplier> getAll();

	 Supplier getById(Long id);
	
	 void remove(Long id);
	 
	 void save(Supplier supplier);
	
}
