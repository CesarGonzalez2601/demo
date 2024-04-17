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

import dev.cesar.springboot.entities.Supplier;
import dev.cesar.springboot.services.SupplierService;
import dev.cesar.springboot.services.ISupplierService;

@RestController
public class SupplierController {

	@Autowired
	private ISupplierService service;
	
	@GetMapping("/api/suppliers")
	public List<Supplier> getAll(){

		return service.getAll();
	}
	
	@GetMapping("/api/suppliers/{id}")
	public Supplier get(@PathVariable String id){

		return service.getById(Long.parseLong(id));
	}
	
	@DeleteMapping("/api/suppliers/{id}")
	public void remove(@PathVariable String id) {
		service.remove(Long.parseLong(id));
	}
	
	@PostMapping("/api/suppliers")
	public void save(@RequestBody Supplier supplier) {
		service.save(supplier);
	}
}
