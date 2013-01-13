
<%@page import="dao.InstrutorDao"%>
<%@page import="modelo.Instrutor"%>
<%@page import="dao.CursoDao"%>
<%@page import="modelo.CursoInstrutor"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>

<!DOCTYPE html>
<%
    int idInst = Integer.parseInt(request.getParameter("id"));
    CursoInstrutor ci = new CursoInstrutor();
    ci.setCurso(new CursoDao().getCurso(Integer.parseInt(request.getParameter("curso"))));
    ci.setPeriodo(request.getParameter("periodo"));
    ci.setProfessor(new InstrutorDao().getInstrutor(idInst));
    ci.setUnidadeABC(null != request.getParameter("abc"));
    ci.setUnidadeUP(null != request.getParameter("up"));
    new InstrutorDao().addCursoInstrutor(ci,idInst);
    response.sendRedirect("alterCursoInst.jsp?id="+idInst);
%>
