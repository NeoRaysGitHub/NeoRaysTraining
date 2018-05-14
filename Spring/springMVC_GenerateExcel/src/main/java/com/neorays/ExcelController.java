package com.neorays;
	
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ExcelController extends AbstractController {

	   @Override
	   protected ModelAndView handleRequestInternal(HttpServletRequest request,
	      HttpServletResponse response) throws Exception {
	      //user data
	      Map<String,String> userData = new HashMap<String,String>();
	      userData.put("1", "Harishankar");
	      userData.put("2", "Suresh");
	      userData.put("3", "Mithilesh");
	      userData.put("4", "Bharat");
	      userData.put("5", "Pradeep");
	      userData.put("6", "Manjunath");
	      return new ModelAndView("UserSummary","userData",userData);
	   }
	}
