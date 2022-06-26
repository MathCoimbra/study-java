<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
  <html lang="pt-br">
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="device-width">
  <title>Exemplo EL</title>
  </head>
  <body>
      <h1>Cálculo com EL : ${((((10 * 26)/57)+9))}</h1>
      <p>Operadores EL: </p>
      	<ul>
			<li>. - acessar uma propridade</li>
			<li>[] - acessar um elemento de array ou list</li>
			<li>() - agrupa uma subexpressão para alterar a ordem de avaliação</li>
			<li>div - divisão</li>
			<li>mod - módulo (resto)</li>
			<li>eq - igualdade</li>
			<li>ne - diferente</li>
			<li>it - menor que</li>
			<li>gt - maior que</li>
			<li>le - menor ou igual</li>
			<li>ge - maior ou igual</li>
			<li>&& - AND lógico</li>
			<li>|| - OR lógico</li>
			<li>! - Unário, negação</li>
			<li>empty - teste de valores de variáveis vazias</li>
		</ul>
  <body>
  </html>