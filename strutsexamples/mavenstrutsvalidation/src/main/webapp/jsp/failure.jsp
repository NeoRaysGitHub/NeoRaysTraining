<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
 <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>StudentID is not valid</h1>
<h1><bean:write name="searchForm" property="sid"/></h1>
<h1>Message<%=request.getAttribute("d") %></h1>
</body>
</html:html>