<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Base de datos de libros</title>
<style>
	table tr td{border: 1px solid black;
	}
</style>
</head>
<body>
<h1>Listado de libros</h1>
<form id="formulario" action="/listadolibros/Controlador">
<table>
<thead>
<tr>
<td>ID</td>
<td>Título</td>
<td>Precio</td>
<td>Opción</td>
</tr>
</thead>
<c:forEach var= "libro" items="${libros}">
	<tr>	
		<td>${libro.id}</td>
		<td><input type="text" value="${libro.titulo}" id="titulomodificar${libro.id}"></td>
		<td><input type="text" value="${libro.precio}" id="preciomodificar${libro.id}"></td>
		<td><input type="button" onclick="borrar(${libro.id })" value="eliminar">
			<input type="button" onclick="modificar(${libro.id})" value="modificar"></td>
	</tr>
</c:forEach>
<tr>
	<th>ID</th>
	<th><input type="text" name="nuevoTitulo"></th>
	<th><input type="text" name="nuevoPrecio"></th>
	<th><input type="submit" value="insertar"></th>
</tr>

</table>
<input type="hidden" name="action" id="action" value="alta">
<input type="hidden" name="libroaborrar" id="libroaborrar" value="alta">
<input type="hidden" name="titulomodificar" id="titulomodificar" value="alta">
<input type="hidden" name="preciomodificar" id="preciomodificar" value="alta">
</form>

<script>
function borrar(id){
	document.getElementById("action").value="eliminar"
	document.getElementById("libroaborrar").value=id
	document.getElementById("formulario").submit()
}

function modificar(id){
	document.getElementById("action").value="modificar"
	document.getElementById("libroaborrar").value=id
	document.getElementById("titulomodificar").value= document.getElementById("titulomodificar"+id).value
	document.getElementById("preciomodificar").value= document.getElementbyId("preciomodificar"+id).value
	
	document.getElementById("formulario").submit();
}
</script>
</body>
</html>