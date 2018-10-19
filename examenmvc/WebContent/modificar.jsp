<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Página de modificación</title>
</head>
<body>
	<h1>Modificación</h1>
	<form id="formulario" action="/examenmvc/Controlador">

		<label>Nombre</label> <input type="text" name="nombre"
			value="<c:out value="${pelota.nombre}"></c:out>"><br> <label>Descripción</label>
		<textarea name="descripcion"><c:out
				value="${pelota.descripcion}"></c:out></textarea>
		<br>		
		<label>Stock</label> <input type="text" name="stock" value="${pelota.stock}"><br>   
			<input type="submit" value="Actualizar">
			<input type="hidden" value="modificar" name="action"> 
			<input type="button" onclick="borrar(${pelota.id })" value="eliminar">
			<input type="hidden" name="action" id="action" value="alta">
			<input type="hidden" value="${pelota.id}" name="identificador">			
			<input type="hidden" name="pelotaborrar" id="pelotaborrar" value="alta">
	</form>
<a href="index.jsp">Volver</a>
<script type="text/javascript">
function borrar(id){
	document.getElementById("action").value="eliminar"
	document.getElementById("pelotaborrar").value=id
	document.getElementById("formulario").submit()
}
</script>
</body>
</html>