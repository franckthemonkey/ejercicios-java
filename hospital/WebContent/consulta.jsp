<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lista de Pacientes</title>
</head>
<body>
<h1>Pacientes ingresados:</h1>
<table>
<tr>
<td>ID</td>
<td>Nombre</td>
<td>Apellido</td>
<td>Fecha Alta</td>
</tr>

<c:forEach var= "paciente" items="${pacientes}">

	<tr>
	<td><a href="Controlador?action=getPaciente&id=${paciente.id}"><c:out value="${paciente.id}"></c:out></a></td>
		<td><c:out value="${paciente.nombre}"></c:out></td>
		<td><c:out value="${paciente.apellido}"></c:out></td>
		<td><fmt:formatDate pattern="dd-MM-yyyy" value="${paciente.fecha_alta}"/></td>
	<tr>
</c:forEach>
</table>
<br>
<a href="index.jsp">Volver</a>
</body>
</html>