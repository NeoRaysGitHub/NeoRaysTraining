<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   First Name  : ${param.first_name} <br>
   Last Name   : ${param.last_name} <br>
   Phone       : ${param.phone} <br>
   Address	   : ${param.address} <br>
   
   Phone 1     :${paramValues.phone[0]} <br>
   Phone 2     :${paramValues.phone[1]} <br>
   
</body>
</html>