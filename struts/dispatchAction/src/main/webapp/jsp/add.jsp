<html>
	<body bgcolor="wheat">
		<h1>Added successfully</h1>
		<%
		String result = (String)request.getAttribute("Add");
		System.out.println(result);
		%>
		Added result is:<%=result %>
	</body>
</html>