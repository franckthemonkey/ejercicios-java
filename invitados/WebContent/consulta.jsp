<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lista de invitados</title>
</head>
<body>
<h1>Lista de invitados a la super fiesta:</h1>
<table>
<c:forEach var= "invitado" items="${invitados}">

	<tr><td><c:out value="${invitado.nombre}"></c:out><td><tr>
</c:forEach>
</table>
<br>
<a href="index.jsp">Volver</a>
</body>
</html>