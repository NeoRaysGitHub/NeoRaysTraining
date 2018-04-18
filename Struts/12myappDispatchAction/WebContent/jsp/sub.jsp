<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<% 
String s1=(String) request.getAttribute("result"); 
System.out.println("result of substraction");
%>
<%= s1 %>

