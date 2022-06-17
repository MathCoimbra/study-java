<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Exemplo JSP / TagLibs</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Nome</th>
		</tr>
		<c:forEach var="n" items="${lista}">
			<tr>
				<td>${n}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>