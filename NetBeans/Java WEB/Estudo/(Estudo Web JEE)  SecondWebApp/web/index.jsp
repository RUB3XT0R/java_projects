<%-- 
    Document   : index
    Created on : 12/01/2011, 14:02:28
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.Product"%>
<jsp:useBean id="productsBean" class="classes.Myproducts" scope="session"/>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabela de produtos:</h1><br>
        <table border="1">

            <tr>
                <td>Id:</td>
                <td>Nome:</td>
                <td>Preço:</td>
            </tr>

            <%
                for (Product prod : productsBean.getProducts()) {
             %>
                      <tr>
                        <td>
                            <a href="selectedproduct.jsp?idOfProduct=<%= prod.getId() %>">
                                <%= prod.getId() %>
                            </a>
                        </td>
                        <td><%= prod.getName() %></td>
                        <td><%= prod.getCost() %></td>
                      </tr>
            <%
                }
            %>

        </table>
    </body>
</html>
