<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html>
<body bgcolor="yellow">

<html:form action="/signup">
<table>
<tr>
<td><bean:message key="sign.username"/>
<td><html:text property="userName"></html:text>
<td><html:errors property="userName"/>
</tr>
<tr>
<td><bean:message key="sign.password"/>
<td><html:text property="password"></html:text>
<td><html:errors property="password"/>
</tr>
<tr>
<td><bean:message key="sign.phone"/>
<td><html:text property="phone"></html:text>
<td><html:errors property="phone"/>
</tr>

</table>
<html:submit value="Enter"></html:submit>

</html:form>

</body>

</html:html>