<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Alta</title>
</head>
<body>
	<h1>Alta</h1>
	<s:form action="nuevo">
		<s:select
			list="#{'Margarita':'Margarita','Vegetal':'Vegetal','Carbonara':'Carbonara','Barbacoa':'Barbacoa'}"
			name="pedido.tipo" label="Tipo"  />
		<s:select
			list="#{'Pequena':'Pequeña','Mediana':'Mediana','Grande':'Grande'}"
			name="pedido.tam" label="Tamaño" />
		<s:textfield name="pedido.codigo" label="Código promocional"
			 />
		<br>
		<s:select list="#{'Si':'Si','No':'No'}" name="pedido.dom"
			label="Entrega a domicilio" />
		<br>

		<s:submit value="Alta" />

	</s:form>

	<p>
		Su pizza le costará
		<s:property value="pedidoValores.costeTotal" />
		euros.
	</p>
	<p><a href="index.jsp"> Volver al inicio</a></p>
</body>
</html>