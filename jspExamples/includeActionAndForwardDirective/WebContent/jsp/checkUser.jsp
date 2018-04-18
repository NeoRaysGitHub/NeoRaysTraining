<% 
if((request.getParameter("name").equalsIgnoreCase("bharath")) && (request.getParameter("pwd").equalsIgnoreCase("bharath@123"))){
	

%> <jsp:forward page="success.jsp">
<%} else {%>
<%@ include file="../html/login.html"%>
<% } %>
