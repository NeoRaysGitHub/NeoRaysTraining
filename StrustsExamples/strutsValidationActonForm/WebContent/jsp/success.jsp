<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html:html>
	<body bgcolor="green">
		<h1>Name: <%= request.getAttribute("a") %></h1>
		<h1>Email: <%= request.getAttribute("b") %></h1>
		<h1>Phone: <%= request.getAttribute("c") %></h1>
	</body>
</html:html>