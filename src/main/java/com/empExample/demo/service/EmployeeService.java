package com.empExample.demo.service;

import com.empExample.demo.model.Employee;

public interface EmployeeService {
	Iterable<Employee> EmpList();
	
	Employee EmpAdd();
	
	Employee EmpItem(int id);
	
	Employee EmpUpdate(int id);
	
	Employee EmpChangePassword(int id);
	
	Employee EmpFilterById (int id);
	
	Iterable<Employee> EmpFilterByName (String name);
	
	String EmpDelete(int id);

}
