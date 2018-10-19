<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Modificar</title>
</head>
<body>
	<h1>Modificación</h1>
	<form id="formulario" action="/examenfinalservlet/Controlador">
		<label>Tipo</label> 
		<input type="text" name="tipo"	value="<c:out value="${pedido.tipo}"></c:out>"><br> 
		<label>Tamaño</label>
		<input type="text" name="tam"	value="<c:out value="${pedido.tam}"></c:out>"><br> 
		<label>Código	promocional</label> 
		<input type="text" name="codigo" /> <br> 
		<label>Entrega	a domicilio</label>
		<input type="text" name="dom" value="<c:out value="${pedido.dom}"></c:out>"><br>
	
		<input type="submit" value="Modificar">
		<input type="hidden" value="modificar" name="action">	
	<input type="button" onclick="borrar(${pedido.id})" value="eliminar">
	<input type="hidden" name="action" id="action" value="alta">
	<input type="hidden" value="${pedido.id}" name="identificador">	
	<input type="hidden" name="pedidoaborrar" id="pedidoaborrar" value="alta">
	</form>
	<a href="index.jsp">Volver</a>
<script type="text/javascript">
function borrar(id){
	document.getElementById("action").value="eliminar"
	document.getElementById("pedidoaborrar").value=id
	document.getElementById("formulario").submit()
}
</script>
</body>
</html>