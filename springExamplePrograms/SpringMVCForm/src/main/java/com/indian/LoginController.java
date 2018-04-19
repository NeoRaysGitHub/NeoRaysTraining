package com.indian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
@RequestMapping(value="/login")
public ModelAndView display()
{
	userTo uo=new userTo();
	return new ModelAndView("enter","uto",uo);
	

}

@RequestMapping(value="/check")
public String checkuser(userTo user)
{
	if(user.getName().equals("bharath")&& user.getPassword().equals("bharath")){
		return "success";
		
	}else{
		
		return "failure";
	}
}
}
