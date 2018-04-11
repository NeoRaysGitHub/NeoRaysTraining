package com.neorays.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neorays.model.Employee;



@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	public void addEmployee(Employee employee) {
		
		System.out.println("inside DAO layer");
		Session session = sessionFactory.getCurrentSession();
		session.persist(employee);
	}

	public List<Employee> listEmployees() {
		Session session = sessionFactory.getCurrentSession();
		List<Employee> EmployeesList = session.createQuery("from Employee").list();
		return EmployeesList;
	}

	

	
	}

