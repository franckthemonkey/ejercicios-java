<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Consulta</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>ID</th>
			<th>Tipo</th>
			<th>Tamaño</th>
			<th>Código promocional</th>
			<th>Entrega a domicilio</th>
		</tr>
<c:forEach var= "pedido" items="${pedidos}">
			<tr>
				<td><a href="Controlador?action=getPedido&id=${pedido.id}"><c:out value="${pedido.id }"></c:out></a></td>
				<td><c:out value="${pedido.tipo}"></c:out></td>
				<td><c:out value="${pedido.tam }"></c:out></td>
				<td><c:out value="${pedido.codigo}"></c:out></td>
				<td><c:out value="${pedido.dom }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	
<br>
<a href="index.jsp">Volver</a>

</body>
</html>