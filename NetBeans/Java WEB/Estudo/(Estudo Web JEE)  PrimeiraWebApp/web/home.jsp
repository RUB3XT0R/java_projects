<%-- 
    Document   : home
    Created on : 10/01/2011, 22:23:30
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean  class="examples.MyClass" id="myBean1" scope="page"/>

<html>
    <head>
        <link href="styles/StyleMyApp.css" rel="StyleSheet" type="Text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="container">

            <div id="header" title="Template Teste">
                <table border="0" align="center">
                        <tr>
                            <td><img src="img/logo.png" width="40" heigth="50"></td>
                            <td><h1>Páginas java teste</h1></td>
                        </tr>
                </table>
            </div>

            <div id="mainnav">
                <center>
                    <a href="#"><img src="img/group.png"></a>
                    <a href="#"><img src="img/project.png"></a>
                    <a href="#"><img src="img/web.png"></a>
                    <a href="#"><img src="img/picker.png"></a>
                    <a href="#"><img src="img/paint.png"></a>
                </center>
            </div>

            <div id="menu">
                <h3>Menu</h3>
                <ul>
                    <a href="#"><li>Helow World</li></a>
                </ul><ul>
                    <a href="#"><li>Helow World</li></a>
                </ul><ul>
                    <a href="#"><li>Helow World</li></a>
                </ul><ul>
                    <a href="#"><li>Helow World</li></a>
                </ul>
            </div>

            <div id="content">
                <jsp:include page="/content.jsp"/>
            </div>

            <div id="footer">
                <% //posso misturar código java com html
                    out.print("eu sou um comando java. ");
                %>
                Copyright © Template Teste 2010
            </div>

        </div>
    </body>
</html>
