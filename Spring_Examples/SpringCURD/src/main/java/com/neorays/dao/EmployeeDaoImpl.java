package com.neorays.dao;

import Autowired;
import Employee;
import EmployeeDAO;
import Repository;
import Session;
import SessionFactory;

import java.util.List;


	
	@Repository
	public class EmployeeDaoImpl implements EmployeeDAO{
		
		@Autowired
		 private SessionFactory sessionFactory;
		
		@Override
		public void addEmployee(Employee employee) {
			Session session = sessionFactory.getCurrentSession();
			session.persist(employee);
		}

		@Override
		public void updateEmployee(Employee employee) {
			Session session = sessionFactory.getCurrentSession();
			session.update(employee);
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Employee> listEmployees() {
			Session session = sessionFactory.getCurrentSession();
			List<Employee> EmployeesList = session.createQuery("from Employee").list();
			return EmployeesList;
		}

		@Override
		public Employee getEmployeeById(int id) {
			Session session = sessionFactory.getCurrentSession();		
			Employee employee = (Employee) session.get(Employee.class, new Integer(id));
			return employee;
		}

		@Override
		public void removeEmployee(int id) {
			Session session = sessionFactory.getCurrentSession();
			Employee employee = (Employee) session.get(Employee.class, new Integer(id));
			if(null != employee){
				session.delete(employee);
			}
		}

}