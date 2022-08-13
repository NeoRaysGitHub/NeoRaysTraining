package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res) throws Exception {

		LoginForm loginForm = (LoginForm) af;

		String strUserName = loginForm.getUsername();
		String strPassword = loginForm.getPassword();

		if (strUserName.equalsIgnoreCase("bharat")
				&& strPassword.equalsIgnoreCase("bharat")) {

			return am.findForward("success");
		}

		return am.findForward("error");
	}

}
