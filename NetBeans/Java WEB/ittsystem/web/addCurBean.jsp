<%-- 
    Document   : addCurBean
    Created on : 10/Nov/2011, 15:18:28
    Author     : Lucas Biason
--%>

<%@page import="dao.InstrutorDao"%>
<%@page import="modelo.Instrutor"%>
<%@page import="dao.CursoDao"%>
<%@page import="modelo.CursoInstrutor"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>

<jsp:useBean id="instrutor" class="modelo.Instrutor" scope="session"/>
<!DOCTYPE html>
<%
    CursoInstrutor ci = new CursoInstrutor();
    ci.setCurso(new CursoDao().getCurso(Integer.parseInt(request.getParameter("curso"))));
    ci.setPeriodo(request.getParameter("periodo"));
    ci.setProfessor(instrutor);
    ci.setUnidadeABC(null != request.getParameter("abc"));
    ci.setUnidadeUP(null != request.getParameter("up"));
    instrutor.getCursosQueLeciona().add(ci);
    response.sendRedirect("addCursoInst.jsp");
%>
