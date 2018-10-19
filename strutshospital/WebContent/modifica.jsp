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
		<s:textfield name="paciente.nombre" label="Nombre"
			value="%{paciente.nombre}" />
		<br>
		<s:textfield name="paciente.apellido" label="Primer apellido"
			value="%{paciente.apellido}" />
		<br>
		<s:hidden name="paciente.id" value="%{paciente.id}" />
		<s:submit action="modificar" value="Actualizar" />
		<s:submit action="eliminar" value="Eliminar" />


	</s:form>
</body>
</html>