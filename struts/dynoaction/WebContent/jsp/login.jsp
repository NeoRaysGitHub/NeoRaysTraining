<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html:html>
<body bgcolor=cyan>
<html:form action="/login">
<bean:message key="login.usename"/>
<html:text property="userName"/>
<br>
<bean:message key="login.password"/>
<html:password property="password"/><br>
<html:submit value="ENter"/>
</html:form>
</body>
</html:html>