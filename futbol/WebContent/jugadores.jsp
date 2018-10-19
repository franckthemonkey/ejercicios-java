<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=uft-8">
<title>Listado jugadores</title>
</head>
<body>
<h1>Jugadores</h1>
<img src="img/${param.foto_escudo}">
<img src="img/${param.foto_equipo}">
<br>

<c:forEach var="jugador" items="${jugadores}">

	<c:out value="${jugador.nombre}"></c:out><br>
	

</c:forEach>

</body>
</html>