package com.neorays.controller;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.model.LoginModel;
import com.neorays.validator.LoginValidation;

@Controller
public class MyController {
	@Autowired
	private LoginValidation lvalid;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	      binder.addValidators(lvalid);
	   }
	
	
	@GetMapping("/")
	public String login(Model model)
	{
		model.addAttribute("log", new LoginModel());
		return "login";
		
	}
	
	@PostMapping("login")
	public String saveLogin(@ModelAttribute("log") @Validated LoginModel log,BindingResult result, Model model)
	{
		
		if(result.hasErrors())
		{
			return "login";
		}
		
		return "success";
		
	}

}
