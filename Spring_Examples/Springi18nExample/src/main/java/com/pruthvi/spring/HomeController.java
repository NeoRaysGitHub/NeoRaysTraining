
package com.pruthvi.spring;

import java.util.Locale;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/welcome.html", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
	
		return "home";
			
		}
	
	

    @RequestMapping(value ="/login.html", method = RequestMethod.POST)
    public String result(@ModelAttribute("firstname")String firstname,BindingResult result, Model model){

    if(result.hasErrors()){

            return "home";

        }else{

           model.addAttribute("firstname",firstname);

           return "login";

        }

    }

   
	}
	

