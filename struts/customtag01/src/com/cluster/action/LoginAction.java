package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;

public class LoginAction extends Action {

	public ActionForward execite(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
               
		     LoginForm loginForm=(LoginForm)af;
		     String strSid=loginForm.getSid();
		     if(strSid.equalsIgnoreCase("CLS-111")){
		    	 return am.findForward("success");
		     }
		     return am.findForward("error");
	}
}
