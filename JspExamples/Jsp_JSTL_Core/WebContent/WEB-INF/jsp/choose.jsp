<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 <c:set var="color" value="${param.color}" scope="request"></c:set>
	<c:choose>
	 	<c:when test="${color eq 'red' or color eq 'RED' }">
	 	 Your favorite color is : ${color}
	 	</c:when>
	 	<c:when test="${color eq 'black' or color eq 'BLACK' }">
	 	Your favorite color is : ${color}
	 	</c:when>
	 	<c:when test="${color eq 'white' or color eq 'WHITE' }">
	 	Your favorite color is : ${color}
	 	</c:when>
	 	<c:otherwise>
	 	 Unknown Color......
	 	</c:otherwise>
	</c:choose>
</body>
</html>