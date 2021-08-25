package com.empExample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empExample.demo.model.Employee;
import com.empExample.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Iterable<Employee> EmpList() {
		return employeeRepository.findAll();
	}


}
