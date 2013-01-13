<%-- 
    Document   : index
    Created on : Mar 7, 2010, 1:17:25 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="/NPEPage.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to My Home !!!</h1>
        <div id="content">
            <jsp:include page="content.jsp"/>
        </div>
        <div id="footer">
            <% out.println("This is my footer !!!"); %>
        </div>
        <br/>
        <br/>
        <br/> 1 + 1 = ${1+1}
        <br/> 1 - 1 = ${1-1}
        <br/> 1 is equal 2 ? = ${1 eq 2}
        <br/> 2 is equal 2 ? = ${2 eq 2}
        <%
         String myTestString = "My Test";
        %>
        <br/>
        <br/>myTestString is null ? = ${myTestString eq null}
        <br/>

        <%
        
        
         String myParam = request.getParameter("myParam");
         out.println("My param is "+myParam.toString());
         
         %>
         
         <%= request.getParameter("myParam") %>

    </body>
</html>
