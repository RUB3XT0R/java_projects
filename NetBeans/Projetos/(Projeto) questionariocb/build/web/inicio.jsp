
<%@page import="modelo.Aluno"%>
<%@page import="controle.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="aluno" scope="session" class="modelo.Aluno"/>

<html>
    <head>
        <title>Questionário Engenharia - Página do Aluno</title>
        <link href="style/posicionamento.css" rel="stylesheet" type="text/css" />
        <%
                    String ra = request.getParameter("ra");
                    String cpf = request.getParameter("cpf");
                    if (ra == null || cpf == null || ra.equals("") || cpf.equals("")) response.sendRedirect("index.jsp");
                    
                    Aluno a = new AlunoDao().getAluno(ra, cpf);
                    aluno.setAno(a.getAno());
                    aluno.setCpf(a.getCpf());
                    aluno.setCurso(a.getCurso());
                    aluno.setEmail(a.getEmail());
                    aluno.setModalidade(a.getModalidade());
                    aluno.setNome(a.getNome());
                    aluno.setRa(a.getRa());
                    
                    if (aluno.getModalidade() == null || aluno.getModalidade().equals("")) 
                        response.sendRedirect("escolherModalidade.jsp");
                    
        %>
    </head>
    <body>

        <div id="topo">
            <h3>Página do Aluno</h3>
        </div>

        <div id="formulario5">
            <table border="0">
                <tr>
                    <td>RA:</td>
                    <td>${aluno.ra}</td>
                </tr>
                <tr>
                    <td>Nome:</td>
                    <td>${aluno.nome}</td>
                </tr>
                <tr>
                    <td>CPF:</td>
                    <td>${aluno.cpf}</td>
                </tr>
                <tr>
                    <td>Opção escolhida:</td>
                    <td>Engenharia (de) <font color="orange">${aluno.modalidade}</font></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td>${aluno.email}</td>
                </tr>
            </table>
                <table  border="0" align="center">
                <tr>
                    <td><form name="principal" action="escolherModalidade.jsp" method="post">
                            <input type="hidden" value="${aluno.ra}" name="ra"/>
                            <input type="hidden" value="${aluno.cpf}" name="cpf"/>
                            <input type="submit" value="Alterar Email e/ou Modalidade" style="height: 30px;"/>
                        </form></td>
                    <td><form name="voltar" action="index.jsp" method="post">
                            <input type="submit" value="Sair" style="height: 30px;"/>
                        </form></td>
                </tr>
            </table>


        </div>
    </body>
</html>
