Java

<body>
  <%@ page session="true" %>
  <%							// a scriptlet 
    String empName = request.getParameter("nameField");	// reading from client
    String empSalary = request.getParameter("salaryField");

    session.setAttribute("en", empName);                // setting with session object
    session.setAttribute("es", empSalary);
                                                        // just a message
    out.println("<b>Employee values are set with session object. <br>");
    out.println("Can be accessed from a different program.</b>");
  %>
<body>
  <%@ page session="true" %>
  <%							// a scriptlet 
    String empName = request.getParameter("nameField");	// reading from client
    String empSalary = request.getParameter("salaryField");
 
    session.setAttribute("en", empName);                // setting with session object
    session.setAttribute("es", empSalary);
                                                        // just a message
    out.println("<b>Employee values are set with session object. <br>");
    out.println("Can be accessed from a different program.</b>");
  %>
 
</body>
