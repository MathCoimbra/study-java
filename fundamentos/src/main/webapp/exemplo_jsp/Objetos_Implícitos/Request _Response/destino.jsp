<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DESTINO DOS DADOS</title>
</head>
<body>
	<!-- Bloco de Scriptlets para receber o parâmetro  da página origem.jsp utilizando o objeto implícito request -->
	<% 
		
		String dados = request.getParameter("parametro1");
		
	%>
		<!-- Bloco de Expression para apresentar o parâmetro  recebido -->
		<p>Parâmetro que foi enviado : <%=dados%></p>
</body>
</html>