<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
      <form name="principal" action="resultado.jsp" method="post">
         Digite o primeiro valor: 
         <input type="text" name="valor1"><br/>
         Digite o segundo valor: 
         <input type="text" name="valor2"><br/>
         <select name="operacao">
                <option selected value="Soma" name="Soma">Soma</option>
                <option value="Subtracao" name="Subtracao">Subtração</option>
                <option value="Divisao" name="Divisao">Divisão</option>
                <option value="Multiplicacao" name="Multiplicacao">Multiplicação</option>
            </select>
         <input type="submit" value="Somar">
      </form>
   </body>

</html>