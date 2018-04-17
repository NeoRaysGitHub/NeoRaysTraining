package com.cluster.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.exception.PhoneNumberNotFoundException;
import com.cluster.form.StudentForm;
import com.cluster.service.PhoneService;
import com.cluster.to.StudentTo;

public class ShowPhoneAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		try {
			StudentForm studentForm = (StudentForm)form;
			StudentTo studentTo = new StudentTo();
			studentTo.setStudentName(studentForm.getStudentname());
			
			PhoneService phoneService = new PhoneService();
			ArrayList arlPhone =  phoneService.getAllPhoneNumber(studentTo);
			request.setAttribute("ARLPHONE", arlPhone);
			return mapping.findForward("success");
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new PhoneNumberNotFoundException("No phones");
		} 
		
	}
	
}
