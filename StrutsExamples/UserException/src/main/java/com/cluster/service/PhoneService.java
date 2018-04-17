package com.cluster.service;

import java.util.ArrayList;

import com.cluster.to.StudentTo;

public class PhoneService {
	public ArrayList getAllPhoneNumber(StudentTo studentTo )throws ArrayIndexOutOfBoundsException{
		String strStudentName = studentTo.getStudentName();
		//collect the phone numbers from database and store in ArrayList
		
		ArrayList arlPhoneNumbers = new ArrayList();
		arlPhoneNumbers.add(0, "1234567890");
		arlPhoneNumbers.add(1, "123456789");
		arlPhoneNumbers.add(2, "12345890");
		if (arlPhoneNumbers.size()==0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		return arlPhoneNumbers;
	}
}
