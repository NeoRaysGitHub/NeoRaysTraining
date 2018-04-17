package com.clust;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	 @RequestMapping(value="/login")
	public ModelAndView display()
	{
		UserTO to=new UserTO();
		return new ModelAndView("enter","uto",to);
	}
	
	 @RequestMapping(value="/check")
	public String checkuser(@ModelAttribute("uto")UserTO user)
	{
		if (user.getUsername().equals("deepa") && user.getPassword().equals("shree")) 
		{
			return "success";
		}
		
		else
		{
			return "failure";
		}
	}
}
