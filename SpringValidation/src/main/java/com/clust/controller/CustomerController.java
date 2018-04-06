package com.clust.controller;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.clust.validation.Customer;
@Controller
	public class CustomerController {

		private static final Logger logger = LoggerFactory
				.getLogger(CustomerController.class);
		
		private Map<String, Customer> customers = null;
		
		public CustomerController(){
			customers = new HashMap<String, Customer>();
		}
		Customer customer=new Customer();
		
		@RequestMapping(value = "/cust/save", method = RequestMethod.GET)
		public String saveCustomerPage(Model model) {
			logger.info("Returning custSave.jsp page");
			
			model.addAttribute("customer", customer);
			System.out.println(customer);
			return "custSave";
		}

		@RequestMapping(value = "/cust/save.do", method = RequestMethod.POST)
		public String saveCustomerAction(@ModelAttribute("customer")@Valid Customer customer, BindingResult bindingResult)
		{
			System.out.println(customer);
			if (bindingResult.hasErrors()) {
				logger.info("Returning custSave.jsp page");
				return "custSave";
			}else
			logger.info("Returning custSaveSuccess.jsp page");
			//model.addAttribute("customer", customer);
			customers.put(customer.getEmail(), customer);
			System.out.println(customers.get(customer.getEmail()));
			return "custSaveSuccess";
			}
		

	}
