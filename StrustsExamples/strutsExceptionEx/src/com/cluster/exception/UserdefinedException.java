package com.cluster.exception;

public class UserdefinedException extends Exception
{
	private String msg;
	
	public UserdefinedException()
	{
		this.msg=msg;
	}
	String toString(String msg)
	{
		return msg;
	}
}
