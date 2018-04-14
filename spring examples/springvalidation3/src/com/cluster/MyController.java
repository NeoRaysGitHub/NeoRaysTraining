package com.cluster;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController{
	
	@RequestMapping(value="/")
	public String enter(Model model){
		
		model.addAttribute("user",new User());
		return "enter";
	}
	
	@RequestMapping(value="/display")
	public String display(@Valid @ModelAttribute("user")User user,BindingResult error){
		
		if(error.hasErrors()){
			return "enter";
		}
		
		return "redirect:/check";
	}
	
	
	@RequestMapping("/check")
	public ModelAndView check(){
		
		return new ModelAndView("success");
	}
}