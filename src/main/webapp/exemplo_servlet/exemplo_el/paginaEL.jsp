<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
  <html lang="pt-br">
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="device-width">
  <title>Exemplo EL</title>
  </head>
  <body>
      <h1>C�lculo com EL : ${((((10 * 26)/57)+9))}</h1>
      <p>Operadores EL: </p>
      	<ul>
			<li>. - acessar uma propridade</li>
			<li>[] - acessar um elemento de array ou list</li>
			<li>() - agrupa uma subexpress�o para alterar a ordem de avalia��o</li>
			<li>div - divis�o</li>
			<li>mod - m�dulo (resto)</li>
			<li>eq - igualdade</li>
			<li>ne - diferente</li>
			<li>it - menor que</li>
			<li>gt - maior que</li>
			<li>le - menor ou igual</li>
			<li>ge - maior ou igual</li>
			<li>&& - AND l�gico</li>
			<li>|| - OR l�gico</li>
			<li>! - Un�rio, nega��o</li>
			<li>empty - teste de valores de vari�veis vazias</li>
		</ul>
  <body>
  </html>