package com.clust.action;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.clust.form.LoginForm;

public class LoginAction  extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		LoginForm loginForm=(LoginForm) form;
		
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		
		if(username.equalsIgnoreCase("cluster")&&password.equalsIgnoreCase("cluster"))
		
		{
			return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}
}
