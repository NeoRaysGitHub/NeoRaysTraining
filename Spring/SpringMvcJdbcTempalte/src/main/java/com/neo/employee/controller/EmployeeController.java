package com.neo.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neo.employee.model.Employee;
import com.neo.employee.service.EmployeeService;
import com.neo.employee.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeService;

	@RequestMapping(value = "employee.do", method = RequestMethod.GET)
	public String showEmployeePage(@ModelAttribute("employee") Employee employee) {
		return "employeeform";
	}

	@RequestMapping(value = "employee.do",params="empno", method = RequestMethod.POST )
	public ModelAndView getEmployeeById(
			@ModelAttribute("employee") Employee employee , BindingResult result) {
		employee = employeeService.getEmployee(employee.getEmpno());
		return new ModelAndView("employee_detais", "employee", employee);
	}
	@RequestMapping(value="allemployees.do", method = RequestMethod.GET)
	public String getAllEmployees(Model model){
		// call service method
		List<Employee> list = employeeService.getAllEmployees();
		model.addAttribute("list", list);
		return "allemployees";
	}
	

	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public String showExceptoin(Model model) {
		model.addAttribute("employee",new Employee());
		model.addAttribute("msg", "Employee Not Found");
		return "employeeform";
	}

}
