package com.cluster.exception;

public class UserNotFoundException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		System.out.println("user is not available for this number");
	}
	
}
