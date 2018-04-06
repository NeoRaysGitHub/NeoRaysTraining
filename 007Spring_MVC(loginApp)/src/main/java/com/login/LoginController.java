package com.login;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public ModelAndView display()
	{
		UserTo uo = new UserTo();
		return new ModelAndView("enter", "uto", uo );
	}
	
	@RequestMapping(value="/check")
	public String checkuser(UserTo user)
	{
		if (user.getName().equals("ashu") && user.getPassword().equals("ash")) 
		{
			return "success";
		}
		
		else
		{
			return "failure";
		}
	}
}
