<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Modificación de datos</h1>
<form action="/hospital/Controlador">

<label>Nombre</label>
<input type="text" name="nombre" value="<c:out value="${paciente.nombre}"></c:out>"><br>

<label>Apellido</label>
<input type="text" name="apellido" value="<c:out value="${paciente.apellido}"></c:out>"><br>

<label>Fecha de Alta</label>
<input type="date" name="fecha_alta" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${paciente.fecha_alta}"/>"><br>



<input type="hidden" value="${paciente.id}" name="identificador">
<input type="hidden" value="modificar" name="action">
<input type="submit" value="Modificar">
</form>
</body>
</html>