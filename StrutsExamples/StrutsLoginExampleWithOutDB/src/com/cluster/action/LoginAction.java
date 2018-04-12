package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;

public class LoginAction extends Action {
	 @Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginForm = (LoginForm) form;
		if(loginForm.getUsername().equalsIgnoreCase("Suresh") && loginForm.getPassword().equalsIgnoreCase("Reddy")){
			return mapping.findForward("success");
		}
		else{
			return mapping.findForward("fail");
		}		
	}
}
