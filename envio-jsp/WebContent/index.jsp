<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejercicio instanciar</title>

</head>
<body>
<form action="/libro-jsp/Controlador">
<p>Nombre del cliente:</p><input type="text" name="titulo"><br/>
<p>Material de la caja:</p><select name="material">
<option value="plastico">Pl�stico</option>
<option value="madera">Madera</option>
<option value="carton">Cart�n</option>
</select><br/>
<p>Selecciona el tama�o de la caja:</p> <input type="checkbox" name="tama�o" value="Grande">Grande<br/>
<input type="checkbox" name="tama�o" value="Mediana">Mediana<br/>
<input type="checkbox" name="tama�o" value="Peque�a">Peque�a<br/>
<p>Comentarios:</p>
<input type="submit" value="Enviar">
</form>
</body>
</html>