<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo Sess�o</title>
</head>
<body>
	<%
	   if(request.getParameter("nomeUsuario") != null)
		session.setAttribute("attrUsuario", request.getParameter("nomeUsuario"));
	%>
	<form method="post" action="login.jsp">
		<fieldset>
			<legend>Login</legend>
			<div>
				<label>Nome de Usu�rio</label><br/>
				<input type="text" name="nomeUsuario">
			</div>
			<div>
				<label>Senha</label><br/>
				<input type="password" name="senha">
			</div>
			<div>
				<input type="submit" value="LOGIN">
			</div>
		</fieldset>
	</form>
	
	<p><a href="servicos.jsp">SERVI�OS</a></p>
	<p><a href="index.jsp">IN�CIO</a></p>
	
</body>
</html>