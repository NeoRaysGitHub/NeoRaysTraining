package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neo.entity.Employee;
import com.neo.service.EmployeeService;
import com.neo.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "employee.do", method = RequestMethod.GET)
	public String showRegisterForm(@ModelAttribute("employee") Employee employee) {
		return "employee";
	}

	@RequestMapping(value = "employee.do", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		String target = "employee";
		target = employeeService.saveEmployee(employee);	
		return target;
		}

}
