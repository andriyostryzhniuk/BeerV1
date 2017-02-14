<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Beer Advisor</title>
</head>
<body>
    <h1 align="center">Emails:</h1>
    <p><%
        HashMap<String, String> emails = (HashMap) request.getAttribute("emails");
//        emails.forEach((name, email) -> {
//            out.print("<center>" + name + ": " + email + "</center><br>");
//        });

        for(HashMap.Entry<String, String> entry : emails.entrySet()) {
            out.print("<center>" + entry.getKey() + ": " + entry.getValue() + "</center><br>");
        }
    %>
</body>
</html>
