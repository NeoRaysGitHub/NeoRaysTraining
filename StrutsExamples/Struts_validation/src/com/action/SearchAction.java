package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.form.SearchForm;

public class SearchAction extends Action
{
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest pRequest, HttpServletResponse pResponse) throws Exception
	{
		
		SearchForm searchform=(SearchForm)pForm;
		String strsid=searchform.getsid();
		String strName="Ashu";
		String strEmail="ash@gmail.com";
		String strPhone="5555555555";
		if(strsid.equals("CLS-B15-555"))
		{
			pRequest.setAttribute("a", strName);
			pRequest.setAttribute("b", strEmail);
			pRequest.setAttribute("c", strPhone);
			return pMapping.findForward("success");
		}
		else
		{
			String strMsg = "student not found";
			pRequest.setAttribute("msg", strMsg);
			return pMapping.findForward("failure");
		}
		
	

	}

}
   