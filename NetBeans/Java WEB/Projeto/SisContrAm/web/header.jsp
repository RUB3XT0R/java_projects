
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <link href="styles/StyleMyApp.css" rel="StyleSheet" type="Text/css"/>
</head>
<body>
    <div id="container">

        <div id="header" title="SisContrAm - Sistema de Controle de Frota de Ambulância">
            <h1>SisContrAm - Sistema de Controle de Frota de Ambulância</h1>
            <p>Uma Aplicação em Java EE6</p>
        </div>

        <div class="wrapper">

            <div class="mainmenu">

                <ul class="menu">
                    <li class="list"><a class="category" href="http://localhost:8080/index.jsp">Home</a></li>
                </ul>

                <ul class="menu">
                    <li class="list">
                        <a class="category" href="#about">Cadastro&nbsp;&nbsp;&raquo;</a>
                        <ul class="submenu">
                            <li><a href="http://localhost:8080/ambulancia/ambulancias.jsp">Ambulâncias</a></li>
                            <li><a href="http://localhost:8080/funcionario/funcionarios.jsp">Funcionários</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="menu">
                    <li class="list">
                        <a class="category" href="#articles">Chamadas&nbsp;&nbsp;&raquo;</a>
                        <ul class="submenu">
                            <li><a href="#articles1">Chamadas</a></li>
                            <li><a href="#articles2">Consultar</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>

    </div>
</body>
