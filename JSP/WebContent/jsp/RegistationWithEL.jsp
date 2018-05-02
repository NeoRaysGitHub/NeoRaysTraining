<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTATION DATA</title>
</head>
<body bgcolor="pink">
	<h1>
   First Name:  		${param.fName}<br>
   Last Name:			${param.lName}<br>
   Primary Phone No:	${param.phNO}<br>
   Email Id:			${param.email}<br>
   
   Primary Phone No:	${paramValues.phNO[0]}<br>
   Secondary Phone  No:	${paramValues.phNO[1]}<br>
 </h1>
</body>
</html>