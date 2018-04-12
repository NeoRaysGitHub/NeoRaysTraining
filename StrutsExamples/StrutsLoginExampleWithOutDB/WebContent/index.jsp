<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html"  prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:form action="/login">
<table border="2" align="center">
  <tr>
    <td>Username :</td><td> <html:text property="username"></html:text>  </td>
  </tr>
 <tr> 
 	<td>Password :</td><td> <html:text property="password"></html:text>  </td>
 </tr>
 <tr> <td colspan="2" align="center"> <html:submit value="Login"></html:submit>
</table>	
</html:form>