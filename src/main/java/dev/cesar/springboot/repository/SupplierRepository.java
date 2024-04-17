package dev.cesar.springboot.repository;

import dev.cesar.springboot.entities.Supplier;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Long>{

}
