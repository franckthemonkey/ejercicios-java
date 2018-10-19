<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Página de alta</title>
</head>
<body>
<form action="/examenmvc/Controlador">
<h1>Alta</h1><br>
<label>Nombre:</label><input type="text" name="nombre"><br>
<label>Descripción:</label><textarea name="descripcion"></textarea><br>

<label>Stock:</label><input type="text" name="stock"><br>
<input type="submit" value="Dar de alta">
<input type="hidden" value="alta" name="action">
<a href="index.jsp">Volver</a>
</form>

</body>
</html>