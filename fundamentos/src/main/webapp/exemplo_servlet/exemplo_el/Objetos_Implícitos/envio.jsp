<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <!DOCTYPE html>
  <html>
  <head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Exemplo EL / Objetos Implicitos</title>
  </head>
  <body>
    <div class="container">
      <h1>Envio de parâmetros para outra página JSP.</h1>
  <form action="recebimento.jsp" method="get">
  <fieldset>
    <legend>Formulário</legend>
    <div>
      <label for="pNome">Nome</label> 
           <input type="text" name="nome"
      id="pNome" placeholder="Digite o seu nome">
    </div>
    <div>
      <label for="pIdade">Idade</label> 
           <input type="number" name="idade"
      id="pIdade" placeholder="Digite a sua idade">
    </div>
    <div>
      <input type="submit" value="Enviar">
    </div>
  </fieldset>
  </form>
  </div>
  </body>
  </html>