<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Referência para a biblioteca core: -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Exemplo JSP / TagLibs</title>
</head>
<body>

	<c:set var="msg" value="Alô mundo!" />

	<p>Mensagem: ${msg}</p>
</body>
</html>

<%-- Biblioteca core:
 
<c:out> - <% = ... > nas expressões

<c:set> - Define o resultado de uma avaliação de expressão em um 
		  'escopo', você pode definir uma espécie de variável no 
		  escopo em que você estiver trabalhando.  

<c:remove> - Remove uma variável de escopo (de um escopo específico 
			 se especificando) 

<c:catch> - Captura qualquer Throwwable (Exception) que ocorrer no 
			body e se você quiser pode optar por expor o resultado é 
			opcional
			 
<c:when> - Subtag de <choose> que Inclui seu body se sua condição foi 
		   alternada para 'true'.
		   
<c:if> - Tag condicional simples que avalia seu body se a condição 
		 fornecida for verdadejra_ O mesmo que if mas sem o Else.
 
<c:otherwise> - Subtag de <choose> que segue <when>, marca e executa 
				somente se todas as condições anteriores forem avaliadas 
				como 'falso'.
				
<c:import> - Recupera uma URL absoluta ou relativa e carrega o seu 
			 conteúdo para a página onde se está utilizando. Muito 
  			 utilizado para modularização

<c:choose> - Tag condicional simples que estabelece um contexto para 
			 operações condicionais mutuamente exclusivas, marcadas por <when> e O mesmo que um switch case, 
  	         que pode ser utilizado como if/else.   			 
  			 
<c:forEach> - A tag de iteração básicas, aceitando muitos tipos de 
			  colections e subconjuntos de suporte e outras 
			  funcionalidades. O mesmo que o foreach

<c:forTokens> - Iterates sobre tokens, separados pelos delimitadores 
		  	    fornecidos.  

<c:param> - Adiciona um parâmetro a uma URL contendo a tag 'Import' 

<c:redirect> - Redireciona para um novo URL
 
<c:url> - Cria uma URL com parâmetros de consulta opcionais 

--%>