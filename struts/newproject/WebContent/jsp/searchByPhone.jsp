<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html>
	<body bgcolor="wheat">
		<br>
			<center>
				<h1>Enter Phone</h1>
					<html:errors/> <br/>
						<html:form action="/searchbyphone">
							<html:text property="phone"/>
							<html:submit value="Enter"/>
						</html:form><br/><br/>
			
						<logic:present name="USERS" scope="request">
							<table border="2" width="80%">
								<tr>
									<td>USERID</td>
									<td>USERNAME</td>
									<td>EMAIL</td>
									<td>PHONE</td>
								</tr>
						<logic:iterate id="user" name="USERS" scope="request">
							<tr>
								<td><bean:write name="user" property="userid"/></td>
								<td><bean:write name="user" property="username"/></td>
								<td><bean:write name="user" property="email"/></td>
								<td><bean:write name="user" property="phone"/></td>
							</tr>
						</logic:iterate>
												
							</table>
				</logic:present>
			
			</center>
	</body>
</html:html>