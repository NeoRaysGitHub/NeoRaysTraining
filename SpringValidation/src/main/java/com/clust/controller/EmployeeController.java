package com.clust.controller;

	import java.util.HashMap;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clust.validation.Employee;



	@Controller
	public class EmployeeController {

		private static final Logger logger = LoggerFactory
				.getLogger(EmployeeController.class);

		private Map<Integer, Employee> emps = null;

		@Autowired
		@Qualifier("employeeValidator")
		private Validator validator;

		@InitBinder
		private void initBinder(WebDataBinder binder) {
			binder.setValidator(validator);
		}

		public EmployeeController() {
			emps = new HashMap<Integer, Employee>();
		}

		@ModelAttribute("employee")
		public Employee createEmployeeModel() {
			// ModelAttribute value should be same as used in the empSave.jsp
			return new Employee();
		}

		@RequestMapping(value = "/emp/save", method = RequestMethod.GET)
		public String saveEmployeePage(Model model) {
			logger.info("Returning empSave.jsp page");
			return "empSave";
		}

		@RequestMapping(value = "/emp/save.do", method = RequestMethod.POST)
		public String saveEmployeeAction(@ModelAttribute("employee") @Valid Employee employee,BindingResult bindingResult, Model model) {
			if (bindingResult.hasErrors()) {
				logger.info("Returning empSave.jsp page");
				return "empSave";
			}
			logger.info("Returning empSaveSuccess.jsp page");
			model.addAttribute("emp", employee);
			emps.put(employee.getId(), employee);
			return "empSaveSuccess";
		}
	}

