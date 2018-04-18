<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Cluster Software Solutions.
(Mob:98451-31637/39
www.clusterindia.com) -->

<html>
<body bgcolor="pink">
<h1>
   USING EL <br>
   Company Name	:${param.compname}<br>
   Salary 		:${param.sal}<br>
   First Name 	:${cookie.FNAME.value}<br>
   Last Name 	:${cookie.LNAME.value}<br>
  </h1>
</body>
</html>
         