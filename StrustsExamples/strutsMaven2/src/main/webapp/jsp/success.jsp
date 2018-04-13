<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>

<html>
	<body bgcolor="blue">
		<h1>Hello <bean:write name="loginForm" property="userName"/></h1><br>	
		<h1>Welcome To Neo Rays Software Solutions</h1>
	</body>
</html>