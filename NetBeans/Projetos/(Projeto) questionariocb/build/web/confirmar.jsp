

<%@page import="modelo.Aluno"%>
<%@page import="controle.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="aluno" scope="session" class="modelo.Aluno"/>

<html>
    <head>
        <title>Questionário Engenharia - Confirmar (Final)</title>
        <link href="style/posicionamento.css" rel="stylesheet" type="text/css" />
        <% aluno.setEmail(request.getParameter("email")); %>
    </head>
    <body>
        <div id="topo2">
                <p>1. Escolha da Engenharia</p>
            </div>
            <div id="topo3">
                <p>2. Confirmação do Email</p>
            </div>
            <div id="topo4Ativo">
                <p>3. Confirmação Geral</p>
            </div>

        <div id="formulario3">
                <p>${aluno.nome}, matriculado no curso ${aluno.curso} no ano de ${aluno.ano}, optou pela </p>
                <p align="center"> - Engenharia (de) <font color="orange">${aluno.modalidade}</font></p>
                <p>Seu email é ${aluno.email}</p>
                <p><b>Você confirma?</b></p>

                <form name="principal" action="cadastrar.jsp" method="post">
                    <input type="submit" value="Confirmar" style="height: 30px; width: 95px;"/>
                </form>
                <form name="voltar" action="escolherModalidade.jsp" method="post">
                    <input type="hidden" value="${aluno.ra}" name="ra"/>
                    <input type="hidden" value="${aluno.cpf}" name="cpf"/>
                    <input type="submit" value="Não Confirmo" style="height: 30px;"/>
                </form>
        </div>
    </body>
</html>