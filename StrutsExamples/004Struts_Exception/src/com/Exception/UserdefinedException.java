package com.Exception;

public class UserdefinedException extends Exception
{
	private String msg;
	public UserdefinedException(String msg)
	{
		this.msg=msg;
	}
	String toString(String msg)
	{
		return msg;
	}
}
