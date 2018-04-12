package com.neo.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neo.service.EmployeeService;
import com.neo.service.EmployeeServiceImpl;

public class GetEmployee extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		// call the service method
		 List list = service.getEmployees();
		 if(list!=null){
			 request.setAttribute("list", list);
			 return mapping.findForward("success");
		 }
		 return mapping.findForward("failure");		
	}
	
}
