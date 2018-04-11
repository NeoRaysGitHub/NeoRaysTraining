<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<html:html>
<body bgcolor="wheat">
<html:form action="/global">
<h1>Global Exceptions</h1>
<table>
<tr><td>
<bean:message key="login.color"/>
</td></tr>
<tr><td>
<html:text property="globalcolor"></html:text>
</td></tr>
<tr>
<td>
<html:submit value="enter"></html:submit>
</td>
<td><html:reset value="reset"></html:reset></td></tr>
</table>

</html:form>
<html:form action="/local">
<h1>Local Exception</h1>
<table>
<tr><td>
<bean:message key="login.colors"/>
</td></tr>
<tr><td>
<html:text property="localcolor"></html:text>
</td></tr>
<tr><td>
<html:submit value="submit"></html:submit>
</td>
<td>
<html:reset value="reset"></html:reset>
</td></tr>

</table>
</html:form>

</body>
</html:html>