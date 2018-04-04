<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html>
	<body bgcolor="cyan">
		<h1>Hello <bean:write name="LoginForm" property="Name"/></h1><br>
		<h1>Welcome to the new world....</h1>
	</body>
</html>