package com.bharath.service;

import java.util.ArrayList;

import com.bharath.vo.StudentTo;

public class PhoneService  {

	
	public ArrayList getAllPhoneNumber(StudentTo pStudentTo )throws ArrayIndexOutOfBoundsException{
		String strStudentName = pStudentTo.getStudentName();
		//collect the phone numbers from database and store in ArrayList
		ArrayList arlPhoneNumbers = new ArrayList();
		if (arlPhoneNumbers.size()==0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		return arlPhoneNumbers;
	}
}
