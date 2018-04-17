<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="pto" class="com.cluster.dto.PersonDTO" scope="request"/>

<html>
<body bgcolor='pink'>

<h1>hello user .....</h1>
<p>
<font color="#0000ff" size="16">
your details are....

your id is--<jsp:getProperty property="id" name="pto"/><br>
your firstname is--<jsp:getProperty property="fname" name="pto"/><br>
your lastname is--<jsp:getProperty property="lname" name="pto"/><br>
salary is--<jsp:getProperty property="salary" name="pto"/>
<a href="./html/login.html">logout</a>
</font>
</p>


</body>
</html>