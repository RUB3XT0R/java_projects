<%-- 
    Document   : java
    Created on : 21/Out/2011, 15:16:46
    Author     : Lucas Biason
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Formação Java</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link href="css/ittstyle.css" rel="StyleSheet" type="Text/css"/>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    </head>
    <body>

        <div class="corpo" id="corpo" align="center">

            <table border="0">

                <tr><jsp:include page="hMenu.jsp"/></tr>
                <tr><jsp:include page="destaques.jsp"/></tr>

                <tr>
                    <td rowspan="2" valign="top"><jsp:include page="menu.jsp"/></td>
                    <td>
                        <div class="box">
                            <ul class="clearfix">
                                <li class="active">Java e Orientação a Objetos</li>
                                <li>Java para Desenvolvimento Web</li>
                            </ul>
                            <div class="content">
                                <jsp:include page="javaOO.jsp"/>
                                <jsp:include page="javaweb.jsp"/>
                            </div>
                        </div>
                    </td>
                </tr>
            </table>
            <img src="img/footer.png" width="720" height="110" />
        </div>


    </body>
</html>