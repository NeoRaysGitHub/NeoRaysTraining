package com.cluster;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController{

	@RequestMapping("/signup")
	public String addcustomer(@Valid@ModelAttribute("customer") Customer customer,BindingResult result){
		
		if(result.hasErrors()){
			
			return "signupform";
		}
		return "redirect:/check";
		
	}
	
	@RequestMapping(value="/check")
	public ModelAndView check(){
		
		return new ModelAndView("done");
	}
	
	@RequestMapping("/")
	public String displaycustomerform(ModelMap model){
		
		model.addAttribute("customer",new Customer());
		return "signupform";
	}
	
}
