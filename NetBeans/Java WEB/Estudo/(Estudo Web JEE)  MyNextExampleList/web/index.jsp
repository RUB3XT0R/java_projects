<%-- 
    Document   : index
    Created on : Mar 7, 2010, 1:48:31 PM
    Author     : Administrador
--%>

<%@page import="devmedia.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="productBean" class="devmedia.MyProducts" scope="session"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <table>
            <tr>
                <td>Id</td>
                <td>Name</td>
                <td>Price</td>
            </tr>
            <%
                for (Product prod : productBean.getProducts()) {
            %>
            <tr>
                <td><a href="selectedProduct.jsp?idOfProduct=<%= prod.getId()%>">Select <%= prod.getId()%></a></td>
                <td><%= prod.getName()%></td>
                <td><%= prod.getCost()%></td>
            </tr>
            <%

            }
            %>
        </table>
    </body>
</html>
