<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Advisor</title>
</head>
<body>
    <h1 align="center">Emails:</h1>
    <p><%

        out.print("<center>" + "adminEmail: " + getServletContext().getInitParameter("adminEmail") + "</center><br>");
        out.print("<center>" + "mainEmail: " + getServletContext().getInitParameter("mainEmail") + "</center><br>");
    %>
</body>
</html>
