package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.SearchForm;

public class SearchAction extends Action
{
 public ActionForward execute(ActionMapping pMap, ActionForm pForm,HttpServletRequest pRequest, HttpServletResponse pResponse)
 {
	 SearchForm searchForm=(SearchForm) pForm;
	 
	 String strSid=searchForm.getSid();
	 
	 String strName="kaveri";
	 String strEmail="kaveri.hi@clusterindia.com";
	 String strPhoneNumber="9465555555";
	 
	 if(strSid.equals("CLS-B5-9999"))
	 {
	    pRequest.setAttribute("a",strName);
	    pRequest.setAttribute("b",strEmail);
	    pRequest.setAttribute("c",strPhoneNumber);
	 return pMap.findForward("success");
	}
	 
	 else
	 {
		 String msg="Student not found";
		 pRequest.setAttribute("d",msg);
		 return pMap.findForward("failure");
	 }
 }
}
