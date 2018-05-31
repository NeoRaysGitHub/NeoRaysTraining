package com.neorays.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.neorays.bean.Employee;
@Path("employee")
public class EmployeeResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Employee getEmployee(){
		Employee employee = new  Employee();
		employee.setEmpno(1000);
		employee.setSalary(20000);
		employee.setName("Reddy");
		return employee;
	}
}
