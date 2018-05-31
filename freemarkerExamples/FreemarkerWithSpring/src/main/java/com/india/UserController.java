package com.india;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	

	private static List<User> userList = new ArrayList<User>();


	static {
		userList.add(new User("bharath", "chennurur"));
		userList.add(new User("sruthi", "anekapathi"));
		userList.add(new User("pandu", "kalepali"));
		userList.add(new User("chitti", "chennuru"));
		userList.add(new User("suni", "nadarapu"));
	}

	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute("model") ModelMap model) {

		model.addAttribute("userList", userList);

		return "index";
	}		
		@RequestMapping(value = "/add", method = RequestMethod.POST)
		public String add(@ModelAttribute("user") User user) {

			if (null != user && null != user.getFirstname()
					&& null != user.getLastname() && !user.getFirstname().isEmpty()
					&& !user.getLastname().isEmpty()) {

				synchronized (userList) {
					userList.add(user);
				}

			}

			return "redirect:index.html";
		}

}