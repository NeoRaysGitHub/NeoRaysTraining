<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html:html>
<html:form action="/login">
<body bgcolor="magento">
<bean:message key="login.sid"/>
<html:text property="sid"/>
<html:submit value="Enter"/>
<html:errors property="sid"/>
</body>
</html:form>
</html:html>