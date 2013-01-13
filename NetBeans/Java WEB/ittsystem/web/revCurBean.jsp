<%-- 
    Document   : revCurBean
    Created on : 10/Nov/2011, 15:43:37
    Author     : Lucas Biason
--%>

<%@page import="modelo.CursoInstrutor"%>
<%@page import="modelo.Curso"%>
<%@page import="dao.CursoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="instrutor" class="modelo.Instrutor" scope="session"/>

<!DOCTYPE html>
<%
    int idCurso = Integer.parseInt(request.getParameter("idCurso"));
    for(CursoInstrutor ci : instrutor.getCursosQueLeciona()){
        if(ci.getCurso().getId()==idCurso){
            instrutor.getCursosQueLeciona().remove(ci);
        }
    }
    response.sendRedirect("addCursoInst.jsp");
%>
