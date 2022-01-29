<%-- 
    Document   : essai
    Created on : 29 janv. 2022, 21:06:08
    Author     : P13A-97-SOATOAVINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String lol=(String)request.getAttribute("lol");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1><%=lol%></h1>
    </body>
</html>
