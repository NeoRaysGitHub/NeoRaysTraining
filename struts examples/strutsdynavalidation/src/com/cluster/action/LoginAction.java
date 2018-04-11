package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res){
  
     DynaActionForm dyna = (DynaActionForm)pForm;
     
     String strName = (String )dyna.get("userName");
     String strpwd =(String) dyna.get("password");
		
	if(strName.equalsIgnoreCase("dinesh")&&strpwd.equalsIgnoreCase("dinesh123")){
		
		return pMapping.findForward("success");
		
	}else{
		
		return pMapping.findForward("error");
	}
	
	}
	} 