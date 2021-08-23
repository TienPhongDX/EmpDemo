package com.empExample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.empExample.demo.model.Employee;
import com.empExample.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public String index(Model model) {
		model.addAttribute("employees", employeeService.findAll());
		return "list";
	}

	@GetMapping("/employee/create")
	public String create(Model model) {
		model.addAttribute("employee", new Employee());
		return "form";
	}
	@GetMapping("/employee/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("employee", employeeService.findOne(id));
		return "form";
	}
	@PostMapping("/employee/search")
	public String search(@RequestParam("s") String s, Model model) {
		if (s.equals("")) {
			return "redirect:/employee";
		}
		model.addAttribute("employees", employeeService.search(s));
		return "list";
	}
	
}
