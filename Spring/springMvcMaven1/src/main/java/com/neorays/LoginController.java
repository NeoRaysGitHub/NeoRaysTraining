package com.neorays;

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
	
	@RequestMapping(value="/check")
	public String checkuser(UserTo user)
	{
		UserTo us=new UserTo();
		us.setName("hari");
		us.setPassword("neorays");
		if(us.getName().equals("hari") && us.getPassword().equals("neorays"))
		{
			return "success";
		}else{
			return "failure";
		}
	}
}
