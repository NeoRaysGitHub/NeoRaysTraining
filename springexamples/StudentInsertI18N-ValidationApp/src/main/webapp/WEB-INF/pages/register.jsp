<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red;text-align:center">Registration page </h1>

<form:form  method="post" style="text-align: center; color: red" commandName="StudentCmd">
  <form:errors path="*"/>
         <spring:message code="reg.label1" />  <form:input path="id"/><form:errors path="id"/><br><br>
         <spring:message code="reg.label2"/>  <form:input path="name"/><form:errors path="name"/><br><br>
         <spring:message code="reg.label2"/> <form:input path="add"/><form:errors path="add"/><br><br>

<input type="submit" value="<spring:message code="reg.label4"/>">

</form:form>
    <%--       
<form action="submit.htm"  method="get" style="text-align: center; color: red">
  <spring:message code="reg.label1" text=""/> : <input type="text" name="id"><br><br>
  <spring:message code="reg.label2"/> : <input type="text" name="name"><br><br>
  <spring:message code="reg.label2"/> : <input type="text" name="add"><br><br>
  <input type="submit"  value="<spring:message code="reg.label4"/>"/>
</form> --%>
<br><br><br><br><br><br>

&nbsp;&nbsp;&nbsp; <a href="?language=de">German</a>
  &nbsp;&nbsp;&nbsp;            <a href="?language=fr">French</a>
   &nbsp;&nbsp;&nbsp;                <a href="?language=hi" style="text-decoration: none">Hindi</a>
     &nbsp;&nbsp;&nbsp;              <a href="?language=en" style="text-decoration: none">English</a>
      &nbsp;&nbsp;&nbsp;              <a href="?language=cn" style="text-decoration: none">Chinese</a>