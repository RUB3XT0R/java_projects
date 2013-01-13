<%-- 
    Document   : content
    Created on : 10/01/2011, 22:26:12
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.Date" errorPage="NPEPage.jsp"%>

<jsp:useBean  class="examples.MyClass" id="myBean" scope="session"/>
<jsp:setProperty name="myBean.getMember()" property="*"/>

<html>
    <head>
        <link href="styles/PageStyle.css" rel="StyleSheet" type="Text/css"/>
        <link href="styles/StyleClasses.css" rel="StyleSheet" type="Text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h2><img src="styles/draw.png" width="30" heigth="30">Hello World!</h2>
        <table>
            <tr>
                <td class="tabletd1"> data sem import: </td>
                <td class="tabletd2"> data com import: </td>
                <td class="tabletd1"> Expression </td>
                <td class="tabletd2"> Parametro</td>
            </tr>
            <tr >
                <td class="tabletd2"> <% out.print(new java.util.Date());%> </td>
                <td class="tabletd1"> <% out.print(new Date());%> </td>
                <td class="tabletd2"> 
                    1 + 1 = ${1+1}<br>
                    1 - 1 = ${1-1}<br>
                    1 is equal 2 ? : ${1 eq 2}<br>
                </td>
                <td class="tabletd1"><%
                            out.print("meu parametro é :" + request.getParameter("myParam"));
                    %> </td>
            </tr>
        </table>
        <%
                    String myString = "*use:http://localhost:8080/?bean=abacaxi<br>ou http://localhost:8080/?myParam=parametro<br>ou http://localhost:8080/?bean=parametro1&myParam=parametro2<br>Onde parametro é um valor qualquer";
                    out.print(myString);
        %>
        <hr color="olive">

        <form action="add.jsp">
            Entre com o nome: <input size="30" id="name" name="name"><br>
            Entre com a idade: <input size="10" id="age" name="age"><br>
            <input type="submit"/>
          
        </form>

    </body>
</html>
