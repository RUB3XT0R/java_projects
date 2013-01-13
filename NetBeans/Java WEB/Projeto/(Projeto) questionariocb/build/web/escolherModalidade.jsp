
<%@page import="modelo.Modalidades"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Aluno"%>
<%@page import="controle.AlunoDao"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="aluno" scope="session" class="modelo.Aluno"/>

<html>
    <head>
        <title>Question�rio Engenharia - Escolha da Engenharia</title>
        <link href="style/posicionamento.css" rel="stylesheet" type="text/css" />
        <%
                    String ra = request.getParameter("ra");
                    String cpf = request.getParameter("cpf");

                    aluno = new AlunoDao().getAluno(ra, cpf);

                    List<String> modalidades = new Modalidades().getModalidades();
        %>
    </head>
    <body>
        
        
            <div id="topo2Ativo">
                <p>1. Escolha da Engenharia</p>
            </div>
            <div id="topo3">
                <p>2. Confirma��o do Email</p>
            </div>
            <div id="topo4">
                <p>3. Confirma��o Geral</p>
            </div>

            <div id="formulario2">
                <form name="principal" action="confirmarEmail.jsp" method="post">
                    Qual � a modalidade de engenharia voc� deseja cursar apartir do ano que vem?<br/>
                    <% for (String  m : modalidades) { %>
                    <input type="radio" value="<%= m %>" name="modalidade" onclick="document.forms.principal.submit();"><%= m %><br/>
                    <%}%>
                </form>
            </div>

            

    </body>
</html>
