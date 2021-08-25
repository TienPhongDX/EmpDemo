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

	@Override
	public Employee EmpAdd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee EmpItem(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee EmpUpdate(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee EmpChangePassword(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee EmpFilterById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Employee> EmpFilterByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String EmpDelete(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}
