package com.neorays.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.form.SignupForm;

public class SignupAction extends Action{
	

	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {

		SignupForm signupForm = (SignupForm) pForm;

		String strUserName = signupForm.getUserName();
		String strPassword = signupForm.getPassword();
		String strPhone = signupForm.getPhone();

		if (strUserName.equalsIgnoreCase("sachin")
				&& strPassword.equalsIgnoreCase("neorays")) {

			return pMapping.findForward("success");
		}

		return pMapping.findForward("error");
	}

}
