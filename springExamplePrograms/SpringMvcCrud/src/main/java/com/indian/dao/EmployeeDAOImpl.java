package com.indian.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.indian.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	{
		System.out.println("EmployeeDAOImpl>>starting");
	}

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee employee) {
		System.out.println("EmployeeDAOImpl>>addEmployee>>inside");
		sessionFactory.getCurrentSession().saveOrUpdate(employee);

	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployees() {
	System.out.println("EmployeeDAOImpl>>List<Employee> getAllEmployees()>>inside& createQuery");
		return sessionFactory.getCurrentSession().createQuery("from Employee")
				.list();
	}

	
	public void deleteEmployee(Integer employeeId) {
		System.out.println("EmployeeDAOImpl>>deleteEmployee>>inside");
		
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(
				Employee.class, employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}

	}

	public Employee getEmployee(int empid) {
		System.out.println("EmployeeDAOImpl>>Employee getEmployee(int empid)>>INSIDE");
		return (Employee) sessionFactory.getCurrentSession().get(
				Employee.class, empid);
	}

	
	public Employee updateEmployee(Employee employee) {
		System.out.println("EmployeeDAOImpl>>updateEmployee(Employee employee)>>inside");
		System.out.println("");
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

}