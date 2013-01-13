<%-- 
    Document   : index
    Created on : Mar 7, 2010, 2:00:37 PM
    Author     : Administrador
--%>

<%@page import="devmedia.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean scope="session" class="devmedia.MyUserControl" id="users"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Click to Edit User</h1>
        <table>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Address</td>
            </tr>
            <%

            for (User usr : users.getUsers()) {
            %>
            <tr>
                <td><a href="editUser.jsp?id=<%= usr.getId()%>">Edit <%= usr.getId()%></a></td>
                <td><%= usr.getName()%></td>
                <td><%= usr.getAddress()%></td>
            </tr>
            <%

            }
            %>
        </table>
    </body>
</html>
