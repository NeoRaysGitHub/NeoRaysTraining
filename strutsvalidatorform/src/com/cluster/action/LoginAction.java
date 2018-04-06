package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res)throws Exception{
		
		LoginForm loginForm = (LoginForm)pForm;
		
		String strName = loginForm.getUserName();
		String strpassword = loginForm.getPassword();
		
		if(strName.equalsIgnoreCase("dinesh") && strpassword.equalsIgnoreCase("dinesh123")){
			
			return pMapping.findForward("success");
			
		}else{
			return pMapping.findForward("failure");
		}
		
		
		
	}
}