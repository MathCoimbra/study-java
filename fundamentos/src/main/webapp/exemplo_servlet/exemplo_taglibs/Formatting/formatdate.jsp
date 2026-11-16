<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <html>
  <head>
    <title>JSTL Formatação de datas</title>
  </head>
  <body>
  
  <h3>Formatação de datas:</h3>
  
  <c:set var="data" value="<%=new java.util.Date()%>" />
  
 <!-- type - tipo de dado a ser exibido: data, hora ou ambos
  	  value - recebe o objeto Date que representa a data e que será formatado
      pattern - determinar como a data será exibida       
 -->
  <p>Data Formatada (1): <fmt:formatDate type="time" 
              value="${data}" /></p>
  <p>Data Formatada (2): <fmt:formatDate type="date" 
              value="${data}" /></p>
  <p>Data Formatada (3): <fmt:formatDate type="both" 
              value="${data}" /></p>
  <p>Data Formatada (4): <fmt:formatDate pattern="dd/MM/yyyy" 
              value="${data}" /></p>
  </body>
  </html>
 
<%-- Opções para o pattern de data:

G - The area designator
Y - The year 
M - The month 
d - The day of the month 
h - The hour(12-hour time) 
H - The hour(24-hour time) 
m - The minute 
s - The second 
S - The millisecond 
E - The day of the week 
D - The day of the year 
F - The day of the week in the month 
w - The week in the year 
W - The week in the month 
a - The a.m/p.m. indicator 
k - The hour(12-hour time) 
K - The hour(24-hour time) 
z - The time zone
 
--%>
  
  
  