package com.cluster.form;

import org.apache.struts.action.ActionForm;

public class StudentForm extends ActionForm
{
	String studentname;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
}
