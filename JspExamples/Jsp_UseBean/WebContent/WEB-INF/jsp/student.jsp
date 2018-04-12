<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		 <jsp:useBean id="std" class="com.cluster.bean.Student" scope="request">
		 
		  <%-- <jsp:setProperty name="std" property="std_no" param="std_no"/>
		  <jsp:setProperty name="std" property="name" param="name"/>
		  <jsp:setProperty name="std" property="address" param="address"/>
		  <jsp:setProperty name="std" property="phone" param="phone"/>
		   --%>
		   <jsp:setProperty name="std" property="*"/>
		  
		 </jsp:useBean>
		 
		 Student No : <jsp:getProperty property="std_no" name="std"/> <br>
		 Student Name : <jsp:getProperty property="name" name="std"/> <br>
		 Student Address : <jsp:getProperty property="address" name="std"/> <br>
		 Student Phone : <jsp:getProperty property="phone" name="std"/> <br>
		
</body>
</html>