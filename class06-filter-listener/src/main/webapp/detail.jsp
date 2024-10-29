<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: starsnight
  Date: 2024/10/22
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online User Detail Page</title>
</head>
<body>
<h2>Online User List</h2>
<%
    Map<String,Object> sessionMap = (Map<String, Object>) application.getAttribute("sessionMap");
    response.setIntHeader("Refresh",5);
%>
<ul>
    <%
        for (Map.Entry<String,Object> entry : sessionMap.entrySet()) {


    %>
    <li>
        <%=entry.getValue()%>
    </li>
    <%
        }
    %>
</ul>
</body>
</html>
