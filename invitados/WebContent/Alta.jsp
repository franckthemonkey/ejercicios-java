<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta de invitado</title>
</head>
<body>
<form action="/invitados/Controlador">
<p>Inserte el nombre del invitado:</p><input type="text" name="nombre"><br/>
<input type="submit" value="Enviar">
<input type="hidden" value="alta" name="action">
<a href="index.jsp">Volver</a>
</form>
</body>
</html>