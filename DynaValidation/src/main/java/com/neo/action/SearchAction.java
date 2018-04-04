package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class SearchAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		DynaActionForm dynaActionForm=(DynaActionForm) form;
		
	String username=(String) dynaActionForm.get("username");
	String password=(String) dynaActionForm.get("password");
	
	if(username.equalsIgnoreCase("deepashree")&&password.equalsIgnoreCase("@clusterindia"))
	{
		return mapping.findForward("success");
	}
	return mapping.findForward("failure");
		
	}
}
