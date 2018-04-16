<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<body bgcolor="purple">
<h1>hello<bean:write  name="loginForm" property="username"/></h1><br>
<h1> you are invalid user</h1>
</body>
</html>