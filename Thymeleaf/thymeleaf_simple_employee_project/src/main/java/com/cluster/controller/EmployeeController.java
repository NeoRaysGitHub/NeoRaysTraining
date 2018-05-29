package com.cluster.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;

import com.cluster.beans.EmployeeRegistrationBean;

@Controller
public class EmployeeController{

	@RequestMapping(value="/")
	public String home(@ModelAttribute("employeeModel") EmployeeRegistrationBean employeeModel){
		//System.out.println("ddhfd"+map.put("employee", employeeRegistrationBean));
		return "register";
	}
	
	/*@RequestMapping(value="/")
	public String index(Model model)
	{
		System.out.println("Inside index");
		model.addAttribute("employeeModel", new EmployeeRegistrationBean());
		System.out.println("Exit index");
		return "register";
	}*/
	@RequestMapping(value="/result")
	public String result(Map<String ,Object>map,@ModelAttribute("employeeModel") EmployeeRegistrationBean employeeRegistrationBean){
		map.put("employeeModel", employeeRegistrationBean);
		System.out.println(employeeRegistrationBean);
		return "registered_user_data";
	}
}
