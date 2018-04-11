package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.cluster.form.DetailsForm;
import com.cluster.form.LoginForm;
import com.cluster.service.LoginService;
import com.cluster.to.LoginTo;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res)throws Exception{
		
		System.out.println("into Action Class");
		LoginForm loginform = (LoginForm)pForm;
		
		
		LoginService loginservice = new LoginService();
		LoginTo isvalid = loginservice.login(loginform);
		/*if(isvalid==true){
			
			System.out.println("success part");
			return pMapping.findForward("success");
			
			
		}*/
		if(loginform.getEmpid().equals(isvalid.getEmp_id())){
			
			return pMapping.findForward("success");	
		}
			ActionErrors errors = new ActionErrors();
			errors.add("fail",new ActionMessage("error.login.fail"));
			saveErrors(req, errors);
			System.out.println("into failure part");
		return pMapping.findForward("failure");
		
		}
		}
