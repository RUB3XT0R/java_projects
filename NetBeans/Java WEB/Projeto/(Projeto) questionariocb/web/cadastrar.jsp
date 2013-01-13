<%-- 
    Document   : cadastrar
    Created on : 28/04/2011, 22:08:48
    Author     : Lucas Biason
--%>

<%@page import="modelo.Aluno"%>
<%@page import="controle.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="aluno" scope="session" class="modelo.Aluno"/>

<html>
    <head>
        <title>Cadastro de pesquisa - Resultado</title>
        <link href="style/posicionamento.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <center>

            <div id="formulario">
                <% String pagina = "";%>
                <%  if (new AlunoDao().insertEngenharia(aluno).equalsIgnoreCase("sucesso")) { %>
                    <h2>Sucesso!</h2>
                    A pesquisa foi completada.<br>
                    <% pagina = "inicio.jsp"; %>
                <% } else { %>
                    <h2>Um erro ocorreu!</h2>
                    Não foi possível completar a pesquisa.<br>
                    <% pagina = "escolherModalidade.jsp"; %>
                <% }%>
                <form name='voltar' action='<%= pagina %>' method='post'>
                        <input type='hidden' value='${aluno.ra}' name='ra'/>
                        <input type='hidden' value='${aluno.cpf}' name='cpf'/>
                        <input type='submit' value='Voltar' style="height: 30px;"/>
                </form>
            </div>
        </center>
    </body>
</html>
