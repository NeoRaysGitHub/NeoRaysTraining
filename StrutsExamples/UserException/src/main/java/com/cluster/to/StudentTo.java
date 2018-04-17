package com.cluster.to;

import java.io.Serializable;

public class StudentTo implements Serializable{
	String studentName;


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}
}
