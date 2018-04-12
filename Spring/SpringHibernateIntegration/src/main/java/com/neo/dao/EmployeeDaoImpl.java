package com.neo.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neo.entity.Employee;

@Repository("employeeDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	/*@Override
	public int saveEmployee(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
		jdbcTemplate.update(sql);
		return 0;
	}*/
	
	public int saveEmployee(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
		Session session = sessionFactory.getCurrentSession();
		Query query =  session.createQuery(sql);
		query.setParameter(0,employee.getEmployee_id());
		query.setParameter(1, employee.getEmployee_name());
		query.setParameter(2, employee.getJob());
		query.setParameter(3, employee.getSal());
		query.setParameter(4, employee.getPhone());
		int count = query.executeUpdate();
		return count;
	}

}
