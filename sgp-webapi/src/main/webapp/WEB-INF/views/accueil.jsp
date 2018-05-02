<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Exemple</title>
<link rel="stylesheet" href="webjars/bootstrap/3.3.7/css/bootstrap.css" />
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nom</th>
				<th>Desactivation</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listeExemples}" var="ex">
				<tr>
					<td>${ex.id}</td>
					<td>${ex.nom}</td>
					<td>${ex.desactivation}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>