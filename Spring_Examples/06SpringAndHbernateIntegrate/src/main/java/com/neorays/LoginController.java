package com.neorays;







import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.model.Employee;
import com.neorays.service.EmployeeService;
import com.neorays.service.LoginService;


@Controller
public class LoginController {
	
	
	
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value ="/employees", method = RequestMethod.GET)
	public String listemployees(Model model) {
		System.out.println("inside controller");
		
		model.addAttribute("employee", new Employee());
		model.addAttribute("employeeList", employeeService.listEmployees());
		return "success.jsp";
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public String addemployee(@ModelAttribute("employee") Employee employee) {

		if (employee.getEmpid()==null) {
			// new employee, add it
			employeeService.addEmployee(employee);
		} 

		return "redirect:/employees";

	}
	
	
	
	@RequestMapping("/login")
	public ModelAndView checkUser(HttpServletRequest request,HttpServletResponse response)
	{
		
		ModelAndView mv=new ModelAndView();
		
		String uname=request.getParameter("nme");
		String pwd=request.getParameter("pwd");
		System.out.println(uname +" "+pwd);
		
		if(new LoginService().check(uname, pwd))
		{
			mv.setViewName("success.jsp");
		}
		else
		
	{
			mv.setViewName("login.jsp");
		}
		
		return mv;
		
	}

}
