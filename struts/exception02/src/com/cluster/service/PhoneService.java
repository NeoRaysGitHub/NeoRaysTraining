package com.cluster.service;

import java.util.ArrayList;

import com.cluster.vo.StudentTo;

public class PhoneService {

	    public ArrayList allPhoneNumber(StudentTo pStudentTo) throws ArrayIndexOutOfBoundsException{
	    	String strStudentName=pStudentTo.getStudentName();
	    	ArrayList al=new ArrayList();
	    	if(al.size()==0){
	    		throw new ArrayIndexOutOfBoundsException();
	    	}
	    	else{
	    		return al;
	    	}
	    }
	
}
