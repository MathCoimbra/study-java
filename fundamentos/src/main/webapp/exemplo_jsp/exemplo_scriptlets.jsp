<%--

Directiva - usadas para alterar informações em um contexto geral das páginas JSP,
acrescentado desta vez o arroba na frente do sinal

	Directiva Page: usada para definir as propriedades da página, incluir código de fonte externa e definir TagLibs
⬇⬇⬇      --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exemplo Scriptlets</title>
</head>
<body>

	<%-- Declarations - usadas para declaração de uma variável, o sinal é parecido com as scriptlets, 
somente é acrescido o sinal de interrogação:
	⬇⬇⬇ --%>
	<%!String nome = "JSP";%>
	<%!int nr = 0;%>
	<%!Object obj = new Object();%>

	<%-- 	Directiva Include: usado para incluir SNIPPET (trecho de código independente do contexto que está inserido) no caso 
	abaixo o menu da página menu.jsp tornando ambas uma página só no navegador --%>
	<nav>
		<%@ include file="menu.jsp"%>
	</nav>

	<!-- Exibindo uma contagem de 1 até 9: -->
	<p>CONTAGEM de 1 a 9</p>
	<ul>

		<%-- Scriptlets - blocos de código Java inseridos dentro das páginas JSP:
		⬇⬇⬇ --%>
		<%
		for (int x = 0; x < 10; x++) {
		%>

		<%-- Também podem ser inseridos no formato de tag XML:

		<jsp:scriptlet> ... </jsp:scriptlet>
		
		Expressions - utilizado para dar saída em informações que serão apresentadas nas páginas JSP, diferente dos demais é 
		acrescido o operador de atribuição (sinal de igual), conforme abaixo: 
			 ⬇⬇⬇				--%>
		<li><%=x%></li>

		<%
		}
		%>
	</ul>
</body>
</html>