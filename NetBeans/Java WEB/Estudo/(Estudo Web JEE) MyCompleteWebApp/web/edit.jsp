<%-- 
    Document   : products
    Created on : May 3, 2010, 9:32:09 AM
    Author     : dyego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="productsBean" scope="session" class="devmedia.mycompletewebapp.control.ProductControl"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <h1>New Product</h1>
        <form action="UpdateProductServlet">
        <table border="1">
            <tr>
                <td>Name</td>
                <td>Price</td>
                <td>In Stock</td>
            </tr>
            <tr>
                <td><input type="text" disabled="true" value="${param.name}" name="name" size="50"/></td>
                <td><input type="text" name="price" value="${param.price}" size="20"/></td>
                <td><input type="text" name="stock" value="${param.stock}"  size="20"/></td>
            </tr>
        </table>
        
        <input type="submit"/>
    </form>
    </body>
</html>
