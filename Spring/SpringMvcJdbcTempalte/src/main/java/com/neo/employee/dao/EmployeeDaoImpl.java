package com.neo.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.neo.employee.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	 static final String SQL_GET_EMPLOYEE_BY_ID = "SELECT ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO = ?";
	 static final String SQL_GET_ALL_EMPLOYEES = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";
	 static final String SQL_GET_ALL_EMPLOYEES_BY_DEPTNO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE DEPTNO = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Employee getEmployee(final int empno) {
		return jdbcTemplate.queryForObject(SQL_GET_EMPLOYEE_BY_ID, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowCount)
					throws SQLException {
				Employee emp = new Employee();
				emp.setEmpno(empno);
				emp.setEname(rs.getString(1));
				emp.setJob(rs.getString(2));
				emp.setSal(rs.getDouble(3));
				emp.setDeptno(rs.getInt(4));
				return emp;
			}
		},empno);
	}

	public List<Employee> getAllEmployees() {
		return  jdbcTemplate.query(SQL_GET_ALL_EMPLOYEES, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowCount) throws SQLException {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setSal(rs.getDouble(4));
				emp.setDeptno(rs.getInt(5));
				return emp;
			}
		} );
		
	}

	public List<Employee> getAllEmployees(int deptno) {
		// TODO Auto-generated method stub
		return null;
	}
}
class EmployeeRowMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowCount) throws SQLException {
		Employee emp = new Employee();
		return null;
	}
	
}
