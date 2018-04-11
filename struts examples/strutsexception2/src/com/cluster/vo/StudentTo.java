package com.cluster.vo;

import org.apache.struts.action.ActionForm;

public class StudentTo extends ActionForm {

	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
