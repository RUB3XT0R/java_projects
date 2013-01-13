<%-- 
    Document   : newjsp
    Created on : 10/Nov/2011, 17:01:21
    Author     : Lucas Biason
--%>

<%@page import="dao.InstrutorDao"%>
<%@page import="modelo.CursoInstrutor"%>
<%@page import="modelo.Curso"%>
<%@page import="dao.CursoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>

<!DOCTYPE html>
<%
    int idCurso = Integer.parseInt(request.getParameter("idCurso"));
    int idInstrutor = Integer.parseInt(request.getParameter("idInst"));
    InstrutorDao dao = new InstrutorDao();
    dao.delCursoInstrutor(idCurso, idInstrutor);
    response.sendRedirect("alterCursoInst.jsp?id="+idInstrutor);
%>
