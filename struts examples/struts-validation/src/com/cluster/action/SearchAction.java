package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.SearchForm;

public class SearchAction extends Action{
	
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res)throws Exception{
		SearchForm searchform = (SearchForm) pForm;
		String strsid=searchform.getSid();
		
		String strName="Dinesh";
		String strEmail="dinesh@neorays.com";
		String strPhone="`1234567890";
		
		if(strsid.equals("CLS-B15-1234")){
			req.setAttribute("a",strName);
			req.setAttribute("b", strEmail);
			req.setAttribute("c",strPhone);
			
			return pMapping.findForward("success");
		}else {
			
			String msg="Student not found";
			req.setAttribute("msg",msg);
			return pMapping.findForward("failure");
		}
		
		
	}
}