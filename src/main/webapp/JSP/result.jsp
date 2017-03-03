<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Advisor</title>
</head>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <p><%
        ArrayList<String> styles = (ArrayList<String>)request.getAttribute("styles");
        for (String item : styles) {
            out.print("<br>try: " + item);
        }

        out.print("<br><br>Session status: " + request.getAttribute("sessionStatus"));
    %>
</body>
</html>
