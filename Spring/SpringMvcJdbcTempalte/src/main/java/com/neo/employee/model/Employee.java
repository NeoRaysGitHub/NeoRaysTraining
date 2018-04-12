package com.neo.employee.model;

public class Employee {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private int deptno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		System.out.println("set:empno");
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("set:ename");
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		System.out.println("set:job");
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		System.out.println("set:sal");
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		System.out.println("set:deptno");
		this.deptno = deptno;
	}
}
