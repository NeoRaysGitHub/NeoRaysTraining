<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<body>
 <h1 align="center"> Welcome to Neorays </h1> <hr> <br>
 <div align="center">
<html:link action="/user.do?link=login" ><bean:message key="login"/></html:link> &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
<html:link action="/user.do?link=register"><bean:message key="register"/></html:link>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
 </div>
</body>
</html>
