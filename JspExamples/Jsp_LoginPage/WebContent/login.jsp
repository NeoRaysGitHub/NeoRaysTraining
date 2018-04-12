<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	 String name = request.getParameter("name");
	 String password = request.getParameter("password");
	 if(name.trim().length()>0 && password.trim().length() > 0 ){
	 if(name.equalsIgnoreCase("suresh") && password.equalsIgnoreCase("suresh")){
		 out.println("Hello.! Mr/Mrs : "+name + " <br> Welcome ");
	 }
	 else {
		 out.println("Hello.! Mr/Mrs : "+name + " <br> You Are Not Valied Person");
	 }
	 }
	 else {
		 out.println("Please Enter Username and Password");
	 }
	%>
</body>
</html>