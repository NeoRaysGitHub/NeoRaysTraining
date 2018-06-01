package demo;

import jaxb.*;
public class Main 
{
	public static void main(String args[])
	{
		EmployJAXB obj=new EmployJAXB();
		obj.marshall();
		obj.unmarshall();
	}
}
