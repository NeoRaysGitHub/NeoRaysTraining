package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LoginForm;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res)throws Exception {
		
		System.out.println("in the firstline");
		LoginForm loginform =(LoginForm)pForm;
		System.out.println("instance of login form");
		String strName = loginform.getName();
		System.out.println("getting name");
		String id = loginform.getId();
		System.out.println("getting id");
		
		if(strName.equalsIgnoreCase("dinesh") && id.equalsIgnoreCase("125")){
			System.out.println("insie success");
			
			return pMapping.findForward("success");
		}else
		{
			System.out.println("insie failure");
			return pMapping.findForward("error");
		}
		
	}
}