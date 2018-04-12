package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HyperLinks extends Action {
 @Override
public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
	 String target = null;
	 // get the request param
	 String link = request.getParameter("link");
	 if(link.equalsIgnoreCase("login")){
		target = "login";
	 }
	 if(link.equalsIgnoreCase("register")){
		 target = "register";
	 }
	 if(link.equalsIgnoreCase("index")){
		 target = "index";
	 }
	return mapping.findForward(target);
	 
}
}
