package com.cluster;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LoginController{
	@RequestMapping("/login")
	public ModelAndView display(){
		
		UserTo uo = new UserTo();
		return new ModelAndView("enter","uto",uo);
	}
	@RequestMapping("/check")
	public String checkuser( UserTo user){
		
		if(user.getName().equals("dinesh")&&user.getPassword().equals("dinesh123")){
			
			
			return "success";
		}
			return "failure";
		
		
	}
}