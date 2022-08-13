<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<html:html>
<body bgcolor="cyan">
<html:javascript forName="searchForm"/>
<html:form action="/search">
<bean:message key="wogin.sid"/><br>
<html:text property="sid"/>

<br>
<html:submit value="Enter"/>

</html:form>
</body>
</html:html>

