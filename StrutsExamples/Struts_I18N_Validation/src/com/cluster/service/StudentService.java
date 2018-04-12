package com.cluster.service;

import java.sql.SQLException;

import com.cluster.dao.StudentDao;
import com.cluster.form.StudentForm;

public class StudentService {
	
	public String  saveStudent(StudentForm std){
		String reslut = "Failure";
		StudentDao dao = new StudentDao();
		// call the dao method
		int count;
	
			try {
				count = dao.saveStudent(std);
				if (count > 0 ){
					reslut = "Success";
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return reslut;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "DBERROR";
			}
			

		
		
		return reslut;
	}

}
