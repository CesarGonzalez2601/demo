package dev.cesar.springboot.repository;

import dev.cesar.springboot.entities.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
