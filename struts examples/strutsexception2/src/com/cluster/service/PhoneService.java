package com.cluster.service;

import java.util.ArrayList;

import com.cluster.vo.StudentTo;

public class PhoneService {
	
	public ArrayList getAllPhoneNumber(StudentTo PstudentTo)throws Exception{
		String strstudentname = PstudentTo.getStudentName();
		//collect the phone numbers from databse and store in arraylist
		ArrayList arlPhoneNumbers = new ArrayList();
		if(arlPhoneNumbers.size()==0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else
			return arlPhoneNumbers;
	}

}
