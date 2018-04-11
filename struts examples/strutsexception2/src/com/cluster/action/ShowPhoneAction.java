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
import com.cluster.vo.StudentTo;

public class ShowPhoneAction extends Action{
	public ActionForward execute(ActionMapping pMapping,ActionForm pForm,HttpServletRequest req,HttpServletResponse res)throws Exception{
		try{
			
			StudentForm studentform = (StudentForm)pForm;
			StudentTo studentTo = new StudentTo();
			studentTo.setStudentName(studentform.getStudentName());
			
			PhoneService phoneservice = new PhoneService();
			ArrayList arlPhone = phoneservice.getAllPhoneNumber(studentTo);
			req.setAttribute("ARLPHONE", "arlphone");
			return pMapping.findForward("success");
		}catch(ArrayIndexOutOfBoundsException e){
			throw new PhoneNumberNotFoundException("No Phones");
		}
		
	}
	
}