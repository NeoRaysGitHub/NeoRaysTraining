
<%@ taglib uri="../WEB-INF/htag.tld" prefix="h" %>

<html>
<head>
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
<% String s1=request.getParameter("num1"); %>
<% String s2=request.getParameter("num2"); %>
<h:add x="<%=s1 %>" y="<%=s2 %>"/>
END OF JSP

</body>
</html>