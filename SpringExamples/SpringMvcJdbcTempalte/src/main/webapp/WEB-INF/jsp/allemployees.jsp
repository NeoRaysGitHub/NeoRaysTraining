<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 align="center">All Employees</h3>
	<hr>
	<br>
	<table align="center" border="1" style="background-color: silver;">
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Job</th>
			<th>Salary</th>
			<th>Dept No</th>
		</tr>
		<c:forEach items="${list}" var="emp">
			<tr>
				<td>${emp.getEmpno()}</td>
				<td>${emp.getEname()}</td>
				<td>${emp.getJob()}</td>
				<td>${emp.getSal()}</td>
				<td>${emp.getDeptno()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>