<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Alta</title>
</head>
<body>
	<h1>Pedido</h1>
	<form action="/examenfinalservlet/Controlador">
		<label>Tipo</label> <select name="tipo">
			<option value="Margarita" selected>Margarita</option>
			<option value="Vegetal">Vegetal</option>
			<option value="Carbonara">Carbonara</option>
			<option value="Barbacoa">Barbacoa</option>
		</select> <br>
		<label>Tamaño</label> <select name="tam">
			<option value="Pequena">Pequeña</option>
			<option value="Mediana" selected>Mediana</option>
			<option value="Grande">Grande</option>
		</select>
		<br> <label>Código promocional</label> <input type="text" name="codigo" />
		<br> <label>Entrega a domicilio</label> <select name="dom">
			<option value="Si" selected>Si</option>
			<option value="No">No</option>
		</select> <br> <input type="submit" value="Hacer Pedido"> <input
			type="hidden" value="nuevo" name="action">

	</form>
	<p>Su pizza le costará:
	<%= request.getAttribute("pedidoValores") %>
	euros.</p>

		<a href="index.jsp"> Volver al inicio</a>
	
</body>
</html>