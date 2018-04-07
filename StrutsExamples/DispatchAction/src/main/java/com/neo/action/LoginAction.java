package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.actions.DispatchAction;

public class LoginAction extends DispatchAction
{
			public ActionForward addition(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest,
				HttpServletResponse pResponse) throws Exception {
			
			DynaActionForm dynaActionForm = (DynaActionForm)pForm;
				
				int intNumber1 = Integer.parseInt((String)dynaActionForm.get("number1"));
				int intNumber2 = Integer.parseInt((String)dynaActionForm.get("number2"));
				int intAddNo=intNumber1+intNumber2;
							
				pRequest.setAttribute("result",String.valueOf(intAddNo));
				return pMapping.findForward("add");
		}
		
		public ActionForward subtract(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest,
				HttpServletResponse pResponse) throws Exception {
			DynaActionForm dynaActionForm = (DynaActionForm)pForm;	
			int intNumber1 = Integer.parseInt((String)dynaActionForm.get("number1"));
			int intNumber2 = Integer.parseInt((String)dynaActionForm.get("number2"));
			int intSubNo=intNumber1-intNumber2;
						
			pRequest.setAttribute("result",String.valueOf(intSubNo));
			return pMapping.findForward("subtract");
		}
		
		public ActionForward multiply(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest,
				HttpServletResponse pResponse) throws Exception {
			DynaActionForm dynaActionForm = (DynaActionForm)pForm;	
			int intNumber1 = Integer.parseInt((String)dynaActionForm.get("number1"));
			int intNumber2 = Integer.parseInt((String)dynaActionForm.get("number2"));
			int intMultiplyNo=intNumber1*intNumber2;
						
			pRequest.setAttribute("result",String.valueOf(intMultiplyNo));
			return pMapping.findForward("multiply");
		}
		public ActionForward division(ActionMapping pMapping, ActionForm pForm, HttpServletRequest pRequest,
				HttpServletResponse pResponse) throws Exception {
			DynaActionForm dynaActionForm = (DynaActionForm)pForm;	
			int intNumber1 = Integer.parseInt((String)dynaActionForm.get("number1"));
			int intNumber2 = Integer.parseInt((String)dynaActionForm.get("number2"));
			int intDivisionNo=(intNumber1)/(intNumber2);
						
			pRequest.setAttribute("result",String.valueOf(intDivisionNo));
			return pMapping.findForward("division");
		}

	}



