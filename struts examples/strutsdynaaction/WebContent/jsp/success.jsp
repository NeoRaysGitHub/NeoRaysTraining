<%@taglib uri="/WEB-INF/struts-bean.tld"  prefix="bean"%>
<html>
<body bgcolor="wheat" >
<h1>Hello<bean:write name="loginForm" property="userName"/></h1>
</body>
</html>