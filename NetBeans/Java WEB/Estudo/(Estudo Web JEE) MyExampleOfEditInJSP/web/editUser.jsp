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
        <h1>Edit the User</h1>
        <%
                    User usr = users.getUserById(Integer.parseInt(request.getParameter("id")));

        %>
        <form action="UpdateUserServlet">
            <table>
                <tr>
                    <td>Id <input type="text" disabled="true" size="5" id="id" value="<%=  usr.getId() %>"/></td>
                    <td>Name <input type="text" size="30" id="name" value="<%=  usr.getName() %>"/></td>
                    <td>Address <input type="text" size="30" id="address" value="<%=  usr.getAddress() %>"/></td>
                    <td><input type="submit"/>
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>
