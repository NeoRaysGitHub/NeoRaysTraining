<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="userName" %>

<html>
<body bgcolor="wheat">
<h1>Hello <bean:write name="loginForm" property="userName"/></h1>
<h1>Not Welcome</h1>
</body>
</html>