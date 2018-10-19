<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Consulta de productos</title>
</head>
<body>
<h1>Consulta</h1>
<table>
<tr>
<th>ID</th>
<th>Nombre</th>
<th>Descripción</th>
<th>Stock</th>
</tr>

<c:forEach var= "pelota" items="${pelotas}">

	<tr>
	<td><a href="Controlador?action=getPelota&id=${pelota.id}"><c:out value="${pelota.id}"></c:out></a></td>
		<td><c:out value="${pelota.nombre}"></c:out></td>
		<td><c:out value="${pelota.descripcion}"></c:out></td>
		<td><c:out value="${pelota.stock}"></c:out></td>
	<tr>
</c:forEach>
</table>
<br>
<a href="index.jsp">Volver</a>
</body>
</html>