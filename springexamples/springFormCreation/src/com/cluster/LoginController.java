package com.cluster;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public ModelAndView display()
	{
		UserTo ut=new UserTo();
		return new ModelAndView("enter","uto",ut);
	}
	
	@RequestMapping(value="check")
	public String checkUser(UserTo user)
	{
		if(user.getName().equals("humpty") && user.getPassword().equals("bumpty"))
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}
