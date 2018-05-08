package com.indian.controller;

import java.io.IOException;
import java.util.List;




import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.indian.model.Employee;

import com.indian.service.EmployeeService;
@Controller
public class EmployeeController {
	{
		System.out.println("EmployeeController>>starting");
	}

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);
	{
		System.out.println("logger in EmployeeController>>after");
	}

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		System.out.println("EmployeeController>>value='/'>>before");
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		System.out.println(" value=/newEmployee(newContact())>>inside");
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		System.out.println("sveEmployee()>>inside");
		if (employee.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			{
				System.out.println("EmployeeController>>employee.getId()>>\t"+employee.getId());
			}
			employeeService.addEmployee(employee);
			System.out.println("EmployeeController>>employeeService.addEmployee(employee);\t>>method calling");
		} else {
			System.out.println("EmployeeController>>employeeService.updateEmployee(employee);\t>>method calling");
			employeeService.updateEmployee(employee);
		}
		System.out.println("EmployeeController>>redirect:/>>inside saveEmployee");
		return new ModelAndView("redirect:/");//redirect:/
		
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		System.out.println("EmployeeController>>inside deleteEmployee()\t>>inside");
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		System.out.println("redirect:/");
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		System.out.println("EmployeeController>>editContact()>>inside");
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);
		return model;
	}

	

	
}