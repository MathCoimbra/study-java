<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ORIGEM DOS DADOS</title>
</head>
<body>
	
	<!-- Link para o envio de parâmetro para a página origem.jsp -->
	<p><a href="destino.jsp?parametro1=JavaServer_Pages">ENVIO DOS DADOS</a></p>
	
	<!-- Uso do objeto response para atualizar uma página por exemplo: -->
	<%
	response.setIntHeader("Refresh", 1);
	%>
</body>
</html>