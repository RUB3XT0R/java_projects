
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <link rel="stylesheet" href="css/main.css" type="text/css" />
        <script language="JavaScript"  src="js/jquery.js" ></script>
        <script language="JavaScript"  src="js/jquery-1.4.2.min.js"></script>
        <script language="JavaScript"  src="js/jquery.cycle.all.min.js"></script>
        <script language="JavaScript"  src="js/jquery-bp.js" ></script>
        <script language="JavaScript" src="js/jquery.destaques.js"></script>
        <script language="JavaScript" src="js/navigation.js" ></script>
</head>
<body>
    <div id="header">
        <table>
            <tr>
                <td><img src="img/logo.png"/></td>
                <td>
                    <h1>Solutions Tech - Estudos e Projetos</h1>
                    <p>Aplicações em JSP com CSS,JQuery e RIA</p>
                </td>
            </tr>
        </table>
    </div>

    <div id="navigation" class="container">
        <div id="home" class="pri-nav"><div><a href="home">hom1</a></div></div>
        <div id="about" class="pri-nav"><div><a href="about">about</a></div></div>
        <div id="services" class="pri-nav"><div><a href="services">services</a></div></div>
        <div id="solutions" class="pri-nav"><div><a href="solutions">solutions</a></div></div>
        <div id="contact" class="pri-nav"><div><a href="contact">contact</a></div></div>
    </div>

    <div class="container">
        <div class="content">
            <div id="content-title">
                <div id="slide">
                    <br/>
                        <jsp:include page="slidesmenu.html"/>
                </div>
            </div>

        </div>
    </div>

</body>
