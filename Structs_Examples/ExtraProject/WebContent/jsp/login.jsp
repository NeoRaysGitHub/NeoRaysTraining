<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html>
<body bgcolor="yellow">

<html:form action="/login" onsubmit="return validateLoginForm(this)">
<html:javascript formName="loginForm"/>
<table>
<tr>
<td><bean:message key="login.username"/>
<td><html:text property="userName"></html:text>
<td><html:errors property="userName"/>
</tr>
<tr>
<td><bean:message key="login.password"/>
<td><html:text property="password"></html:text>
<td><html:errors property="password"/>
</tr>

</table>
<html:submit value="Enter"></html:submit>

</html:form>

</body>

</html:html>