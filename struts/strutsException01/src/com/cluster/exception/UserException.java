package com.cluster.exception;

public class UserException extends Exception {
                       
private String msg;
	
	public UserException(String msg)
	{
		this.msg=msg;
	}
	
	String toString(String msg)
	{
		return msg;
	}

}
