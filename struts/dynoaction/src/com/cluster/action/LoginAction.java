package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action {

	public ActionForward execute(ActionMapping am, ActionForm af,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
           DynaActionForm dyno=(DynaActionForm)af;
           
           String strUserName=(String)dyno.get("userName");
           String strPassword=(String)dyno.get("password");
           
           if(strUserName.equalsIgnoreCase("bharat") && strPassword.equalsIgnoreCase("bharat")){
        	   return am.findForward("success");
        	   }
           return am.findForward("failure");
	}
}
