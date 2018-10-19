<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Alta de invitado</title>
</head>
<body>
<form action="/hospital/Controlador">
<p>Inserte el nombre:</p><input type="text" name="nombre"><br>
<p>Inserte el apellido:</p><input type="text" name="apellido"><br>
<p>Introduzca la fecha del alta: </p><input type="date" name="fecha_alta"><br>
<input type="submit" value="Enviar">
<input type="hidden" value="alta" name="action">
<a href="index.jsp">Volver</a>
</form>
</body>
</html>