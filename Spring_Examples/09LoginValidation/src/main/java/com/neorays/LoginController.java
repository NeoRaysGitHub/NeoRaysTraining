package com.neorays;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.service.LoginService;

@Controller
public class LoginController {
	

	@RequestMapping(value = "/")
	public String enter(Model model) {

		model.addAttribute("user", new User());

		return "login";
	}

	@RequestMapping(value = "/display")
	public ModelAndView display(@Valid @ModelAttribute("user") User user1,
			BindingResult error) {
		String uname = user1.getName();
		String pwd = user1.getPassword();
		System.out.println("refference in display" + user1);
		System.out.println("inside validation");
		
		System.out.println("inside validate ---- " + uname + " " + pwd);
		
	ModelAndView mv=new ModelAndView();

		if (error.hasErrors()) {
			
			System.out.println("inside haserror");
			
			mv.setViewName("login");
		}
         
		
		if(new LoginService().check(uname, pwd))
		{
			System.out.println("persistance");
			mv.setViewName("success");
			mv.addObject("nme",uname );
		}
		else
		{
		mv.setViewName("login");
		}
	
		
		return mv;
			
	}

	/*@RequestMapping("/login")
	public ModelAndView checkUser() {
		ModelAndView mv = new ModelAndView();
		System.out.println("refference in login " + user);

		String name = user.getName();
		String pwd = user.getPassword();
		System.out.println(name + " " + pwd);

		if (new LoginService().check(name, pwd)) {
			mv.setViewName("success");
		} else

		{
			mv.setViewName("check");
		}

		return mv;

	}*/

}
