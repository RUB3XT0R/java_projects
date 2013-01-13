<%-- 
    Document   : products
    Created on : May 3, 2010, 9:32:09 AM
    Author     : dyego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="productsBean" scope="session" class="devmedia.mycompletewebapp.control.ProductControl"/>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <h1>The Products</h1>
        <table border="1">
            <tr>
                <td>Name</td>
                <td>Price</td>
                <td>In Stock</td>
                <td>Actions</td>
            </tr>
            <c:forEach items="${productsBean.listOfProducts}" var="product">
                <td><a href="show.jsp?name=${product.name}">${product.name}</a></td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td><a href="edit.jsp?name=${product.name}&stock=${product.stock}&price=${product.price}">edit</a> <a href="RemoveServlet?name=${product.name}">remove</a></td>
            </c:forEach>
        </table>
        <a href="add.jsp">Add new Product</a>
    </body>
</html>
