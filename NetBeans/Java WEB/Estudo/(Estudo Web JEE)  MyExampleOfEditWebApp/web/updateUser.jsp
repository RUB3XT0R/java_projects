<%-- 
    Document   : content
    Created on : 10/01/2011, 22:26:12
    Author     : Lucas Biason
--%>

<%@page import="classes.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Date" errorPage="NPEPage.jsp"%>
<jsp:useBean id="users" class="classes.MyUserControl" scope="session"/>

<%
            User usr = users.getUserById(Integer.parseInt(request.getParameter("id")));
            usr.setAddress(request.getParameter("address"));
            usr.setName(request.getParameter("name"));
%>
<jsp:forward page="index.jsp"/>