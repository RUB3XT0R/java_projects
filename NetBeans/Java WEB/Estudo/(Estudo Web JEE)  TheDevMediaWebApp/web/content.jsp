<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
This Page has been included !!!
<br/>
See this:
<br/>
<%

            String myString = " first JSP Scriptlet Script !!!";
            out.println(myString+ " the time is "+new Date());
%>
<br/>
<br/>
Here is the JSP code !!!
<br/>
<br/>

<%
out.println(myString+ " the second time is "+new java.util.Date()+"<br/>");
%>
