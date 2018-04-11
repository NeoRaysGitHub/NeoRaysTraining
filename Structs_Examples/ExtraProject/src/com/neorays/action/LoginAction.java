package com.neorays.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.form.LoginForm;

public class LoginAction extends  Action{
	
	
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {

		LoginForm loginForm = (LoginForm) pForm;

		String strUserName = loginForm.getUserName();
		String strPassword = loginForm.getPassword();

		if (strUserName.equalsIgnoreCase("sachin")
				&& strPassword.equalsIgnoreCase("neorays")) {

			return pMapping.findForward("success");
		}

		return pMapping.findForward("error");
	}
}
