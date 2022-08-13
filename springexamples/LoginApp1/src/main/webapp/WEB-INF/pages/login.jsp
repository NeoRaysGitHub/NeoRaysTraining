<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
<h1>Home Page</h1>
<form:form action="login.htm" method="get" commandName="login">
   UserName: <form:input   path="name"/>
                         <form:errors path="name"/><br><br>
   
   
   Password:<form:input path="password"/>
                      <form:errors path="password"/>
   <br><br>
   <input type="submit" value="submit">
   
  
   </form:form>
    <br><br><br>
   <a href="select.htm">Get Login data</a>
   
   <br><br><br>
   
   <a href="delete.html">Delete</a>
    <br><br><br>
    <a href="update.html">Update</a>
</body>
</html>