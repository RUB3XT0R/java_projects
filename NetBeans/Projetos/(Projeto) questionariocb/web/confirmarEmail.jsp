
<%@page import="modelo.Aluno"%>
<%@page import="controle.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="aluno" scope="session" class="modelo.Aluno"/>

<html>
    <head>
        <title>Questionário Engenharia - Confirmar Email</title>
        <link href="style/posicionamento.css" rel="stylesheet" type="text/css" />
        <script language="JavaScript" src="js/validacoes.js"></script>
    </head>
    <body>

        <div id="topo2">
                <p>1. Escolha da Engenharia</p>
            </div>
            <div id="topo3Ativo">
                <p>2. Confirmação do Email</p>
            </div>
            <div id="topo4">
                <p>3. Confirmação Geral</p>
            </div>


        <div id="formulario2">
            <form name="principal" action="confirmar.jsp" method="post">
                    <%
                                aluno.setModalidade(request.getParameter("modalidade"));
                                System.out.println(aluno.toString());

                                if (aluno.getEmail() != null && !aluno.getEmail().equals("")) {
                    %>
                        <p>Email:
                            <input type="text" value="<%= aluno.getEmail() %>" name="emailcadastrado" disabled="disabled" style="border: none; background-color: transparent; color: crimson;" size="50"/>
                        </p>
                        <p>Confirme o email cadastrado:
                            <input type="checkbox" name="confirma" value="Confirmar" onclick="confirmar()">Confirme ou
                        </p>
                    <%          } else {%>
                        <p>Nenhum email foi localizado em seu cadastro.</p>
                    <%          }%>
                    Entre com o email que você acessa diariamente:<br/>
                    <input type="text" size="30" name="email"/>(xxx@xxx.xxx)
                    <input type="hidden" value="" name="emailerro" style="border: none; color: darkred; background-color: transparent;">
                    <input type="button" value="Proximo >>" onclick="validarEmail()" style="height: 30px;"/>
            </form>
        </div>
    </body>
</html>
