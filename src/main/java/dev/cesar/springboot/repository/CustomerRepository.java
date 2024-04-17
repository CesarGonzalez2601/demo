package dev.cesar.springboot.repository;

import dev.cesar.springboot.entities.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
