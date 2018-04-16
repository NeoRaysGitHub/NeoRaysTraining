package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.Exception.UserdefinedException;
import com.Form.GlobalColorForm;

public class GlobalColorAction extends Action
{
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
				
		GlobalColorForm globalForm = (GlobalColorForm)pForm;
		 String strColor = globalForm.getGlobalcolor();
		 
		if (strColor.equalsIgnoreCase("red")) {
			throw new ArithmeticException();
		}

		if (strColor.equalsIgnoreCase("blue")) {
			throw new ArrayIndexOutOfBoundsException();
		}

		if (strColor.equalsIgnoreCase("green")) {
			throw new NumberFormatException();
		}
		if (strColor.equalsIgnoreCase("yellow")) {
			throw new UserdefinedException("hi");

		}

		return null;
		
		
		
	}

}
