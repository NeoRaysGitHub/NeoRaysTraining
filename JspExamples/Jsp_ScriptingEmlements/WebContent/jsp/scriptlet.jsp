<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  Scriptlet tag 
	  -------------
 Used to place java code in side the tags -->
  <% int i = 10 ;
  	 int j = 20 ;
  	 int sum = i+j;
  	 out.println("<h1> Hello.! <br> This is scriptlet tag  </h1> ");
  	 out.println("<br> Sum of values i + j :"+sum);
  	 out.println("<br>Loops in scriptlet :<br>");
  	 for(int a=1;a<3;a++){
  		 out.println("For loop :"+a +"<br>");
  	 }
  	 
  	 out.println("<br> System Date :"+new Date());
  	 
  	 
  	 out.println("  <br> End Of Scriptlet .");
  	
  	%>
  	<br>
    End Of Jsp...!
</body>
</html>