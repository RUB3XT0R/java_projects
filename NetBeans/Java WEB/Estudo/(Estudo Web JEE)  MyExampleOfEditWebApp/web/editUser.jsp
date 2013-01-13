<%-- 
    Document   : content
    Created on : 10/01/2011, 22:26:12
    Author     : Lucas Biason
--%>

<%@page import="classes.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Date" errorPage="NPEPage.jsp"%>
<jsp:useBean id="users" class="classes.MyUserControl" scope="session"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <hr color="olive">
        <h1>Edit User</h1>
        <%
            User usr = users.getUserById(Integer.parseInt(request.getParameter("idOfUser")));
        %>
        <hr color="olive">
        <form action="updateUser.jsp">
            Id: <input size="5" id="name" name="id" value="<%= usr.getId() %>" ><br>
            Nome:<br><input size="30" id="name" name="name" value="<%= usr.getName() %>" ><br>
            Endereço:<br><input size="50" id="age" name="address" value="<%= usr.getAddress() %>"><br>
            <input type="submit"/> 
        </form>
        <hr color="olive">
    </body>
</html>
