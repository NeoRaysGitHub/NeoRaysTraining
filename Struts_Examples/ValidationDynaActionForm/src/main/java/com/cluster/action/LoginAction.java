package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action {
	
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse)throws Exception{
		
		DynaActionForm dynaActionForm=(DynaActionForm)pForm;
		String strName=(String)dynaActionForm.get("Name");
		String strPassword=(String)dynaActionForm.get("Password");
		
		if(strName.equalsIgnoreCase("pruthvi") && strPassword.equalsIgnoreCase("shivakumar")){
			
			return pMapping.findForward("success");
		}
		return pMapping.findForward("failure");
		
	}

}
