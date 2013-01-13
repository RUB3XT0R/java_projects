<%-- 
    Document   : index
    Created on : 12/01/2011, 16:11:35
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="classes.User" %>
<jsp:useBean id="users" class="classes.MyUserControl" scope="session"/>

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
                <td>Nome</td>
                <td>Endereço</td>
                <td>Action</td>
            </tr>
            <%
                for (User usr : users.getUsers()) {
             %>
                      <tr>
                        <td><%= usr.getId() %></td>
                        <td><%= usr.getName() %></td>
                        <td><%= usr.getAddress() %></td>
                        <td>
                            <a href="editUser.jsp?idOfUser=<%= usr.getId() %>">Edit</a>
                        </td>
                      </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
