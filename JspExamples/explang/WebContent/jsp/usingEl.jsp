<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="orange">
<h1> using EL to print details
student id:${sessionScope.STO.id}
student name=${STO.name}
student phone=${STO.phone}
</h1>
</body>
</html>