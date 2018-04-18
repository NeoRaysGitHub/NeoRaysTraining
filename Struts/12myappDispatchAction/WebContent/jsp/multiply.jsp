<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<% 
 String result=(String)request.getAttribute("result");
  System.out.println(result);
 %>
 
 <%= result%>