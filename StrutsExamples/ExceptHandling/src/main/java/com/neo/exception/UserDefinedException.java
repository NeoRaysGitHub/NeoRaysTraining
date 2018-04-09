package com.neo.exception;

public class UserDefinedException  extends Exception
{

	private String msg;

	public UserDefinedException(String msg)
	{
		this.msg=msg;
	}
	
	String toString(String msg)
	{
		return msg;
	}

}
