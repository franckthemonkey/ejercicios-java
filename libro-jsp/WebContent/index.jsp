<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.libro.Libro"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio instanciar</title>

</head>
<body>
<form action="/libro-jsp/Controlador">
<p>Insertar título:</p><input type="text" name="titulo"><br/>
<p>Insertar isbn:</p><input type="text" name="isbn"><br/>
<p>Insertar precio:</p><input type="text" name="precio"><br/>
<input type="submit" value="Enviar">
</form>
</body>
</html>