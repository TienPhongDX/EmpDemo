package com.empExample.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.empExample.demo.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	List<Employee> findByNameContaining(String q);
	Employee findOne(int id);


}
