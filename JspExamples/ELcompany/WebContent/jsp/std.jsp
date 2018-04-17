<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="STO" class="com.cluster.el.StudentDTO" scope="request"/>
<html>
<body bgcolor="orange">
<h1>TO output using standard actions</h1>
Student details are:<br>
STUDENT ID	:<jsp:getProperty name="STO" property="studentId"/> <br>
NAME 		:<jsp:getProperty name="STO" property="name"/> <br>
PHONE 		:<jsp:getProperty name="STO" property="phone"/> <br>
</body>
</html>