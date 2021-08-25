package com.empExample.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.empExample.demo.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {


}
