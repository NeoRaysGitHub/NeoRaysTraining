<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="/WEB-INF/header.html" %>
<div>
	<h1 align="center"><bean:message key="header"/></h1>
	<html:form action="/reg">

		<table border="2" align="center">
			<tr>
			 <td><bean:message key="id"/></td><td><html:text property="id" ></html:text></td><html:errors  property="id"/>
			</tr>
			<tr>
			 <td><bean:message key="name"/></td><td><html:text property="name"></html:text></td><html:errors property="name"/>
			</tr>
			<tr>
			 <td><bean:message key="address"/></td><td><html:text property="address"></html:text></td><html:errors property="address"/>
			</tr>
			<tr>
			 <td><bean:message key="phone"/></td><td><html:text property="phone"></html:text></td><html:errors property="phone"/>
			</tr>
			<tr>
			<td colspan="2" align="center"><html:submit value="Submit"></html:submit></td>
		</table>
	</html:form>
	 <div align="center" >
	 <html:link action="/locale.do?language=te">Telugu</html:link>	
	<html:link action="/locale.do?language=en">English</html:link>
	<html:link action="/locale.do?language=hn">Hindi</html:link>
	 </div>
</div>
<%@include file="/WEB-INF/footer.html" %>
</html>