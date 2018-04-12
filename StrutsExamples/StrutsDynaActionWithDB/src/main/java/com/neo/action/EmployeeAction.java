package com.neo.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.neo.form.EmployeeForm;
import com.neo.service.EmployeeService;
import com.neo.service.EmployeeServiceImpl;

public class EmployeeAction extends DispatchAction{
	
	public ActionForward save(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		// convert the form to employeefrom
		EmployeeForm empForm = (EmployeeForm) form;
		// call the req service method
		EmployeeService service = new EmployeeServiceImpl();
		return mapping.findForward(service.saveEmployee(empForm));
		
	}
	public ActionForward update(ActionMapping mapping, ActionForm form,
			HttpServletRequest req, HttpServletResponse res) throws Exception {
		EmployeeForm empForm = (EmployeeForm) form;
		// call the req service method
		EmployeeService service = new EmployeeServiceImpl();
		return mapping.findForward(service.updateEmployee(empForm));
	}

}
