<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= new Date().toString() %>
</h1>
<br/>
<%
    System.out.println("JSP页面被加载");
%>
</body>
</html>