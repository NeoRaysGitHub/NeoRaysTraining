package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cluster.form.LoginForm;


public class LoginAction extends Action
{
  public ActionForward execute(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest, HttpServletResponse pResponse) throws Exception
  {
 
  
	LoginForm loginForm=(LoginForm)pForm;
	
	String strUserName=loginForm.getUserName();
	String strPassword=loginForm.getPassword();
	
	if(strUserName.equalsIgnoreCase("cluster") && strPassword.equalsIgnoreCase("software"))
	{
		return pMapping.findForward("Success");
	}
  
  
  
  return pMapping.findForward("Failure");
  }
}
  
  

