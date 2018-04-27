package com.indian.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.indian.form.EmployeeForm;

public class EmployeeAction extends Action {

	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
		
		EmployeeForm employeeform=(EmployeeForm)pForm;
		String strName=employeeform.getName();
		int intId=employeeform.getId();
		if(strName.equalsIgnoreCase("bharath")&&(intId==125)){
			return  pMapping.findForward("success");
		}
		else{
			return pMapping.findForward("error");
			
		}
	}

}
