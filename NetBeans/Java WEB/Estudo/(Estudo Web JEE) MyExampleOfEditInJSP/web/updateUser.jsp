<%-- 
    Document   : index
    Created on : Mar 7, 2010, 2:00:37 PM
    Author     : Administrador
--%>

<%@page import="devmedia.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean scope="session" class="devmedia.MyUserControl" id="users"/>
        <%
                    User usr = users.getUserById(Integer.parseInt(request.getParameter("id")));
                    usr.setName(request.getParameter("name"));
                    usr.setAddress(request.getParameter("address"));

        %>
        <jsp:forward page="index.jsp"/>
