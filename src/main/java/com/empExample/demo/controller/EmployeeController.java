package com.empExample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empExample.demo.model.Employee;
import com.empExample.demo.service.EmployeeService;
import com.empExample.demo.service.EmployeeServiceImpl;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/emp")
	public Iterable<Employee> EmployeeListAll(){ 
		return employeeService.EmpList();
	}
	
	
}
