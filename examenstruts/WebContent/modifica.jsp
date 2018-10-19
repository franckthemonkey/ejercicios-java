<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Modificar</title>
</head>
<body>
	<h1>Modificación</h1>
	<s:form>
		<s:select
			list="#{'Margarita':'Margarita','Vegetal':'Vegetal','Carbonara':'Carbonara','Barbacoa':'Barbacoa'}"
			name="pedido.tipo" label="Tipo" value="%{pedido.tipo}" />
		<br>
		<s:select
			list="#{'Pequeña':'Pequeña','Mediana':'Mediana','Grande':'Grande'}"
			name="pedido.tam" value="%{pedido.tam}" label="Tamaño" />
		<br>
		<s:textfield name="pedido.codigo" label="Código promocional"
			value="%{pedido.codigo}" />
		<br>
		<s:select list="#{'Si':'Si','No':'No'}" name="pedido.dom"
			value="%{pedido.dom}" label="Entrega a domicilio" />
		<br>
		<s:hidden name="pedido.id" value="%{pedido.id}" />
		<s:submit action="modificar" value="Actualizar" />
		<s:submit action="eliminar" value="Eliminar" />


	</s:form>
</body>
</html>