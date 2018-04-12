package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.StudentForm;
import com.cluster.service.StudentService;

public class StudentAction extends Action {
		@Override
		public ActionForward execute(ActionMapping mapping, ActionForm form,
				HttpServletRequest request, HttpServletResponse response)
				throws Exception {	
			String result = null;
			StudentForm std = (StudentForm) form;
			StudentService  service = new StudentService();
			// call the service method
			result = service.saveStudent(std);
			return mapping.findForward(result);
		}

}
