package com.neorays;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neorays.User;

@Controller
public class UserController {
	/**
	 * Static list of users to simulate Database
	 */
	private static List<User> userList = new ArrayList<User>();

	//Initialize the list with some data for index screen
	static {
		userList.add(new User("Harishakanr", "Pradhan"));
		userList.add(new User("Suresh", "Kumar"));
		userList.add(new User("Mithilesh", "Mukharjee"));
		userList.add(new User("Bharat", "Ariwar"));
		userList.add(new User("Pradeep", "hajra"));
	}

	/**
	 * Saves the static list of users in model and renders it 
	 * via freemarker template.
	 * 
	 * @param model 
	 * @return The index view (FTL)
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute("model") ModelMap model) {

		model.addAttribute("userList", userList);

		return "index";
	}

	/**
	 * Add a new user into static user lists and display the 
	 * same into FTL via redirect 
	 * 
	 * @param user
	 * @return Redirect to /index page to display user list
	 */
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