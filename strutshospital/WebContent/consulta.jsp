<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
			<th>Nombre</th>
			<th>Apellido</th>

		</tr>
		<s:iterator value="pacientes">
			<tr>
				<td><a
					href="consultarPaciente.action?paciente.id=<s:property value="id"/>"><s:property
							value="id" /></a></td>
				<td><s:property value="nombre" /></td>
				<td><s:property value="apellido" /></td>

			</tr>
		</s:iterator>
	</table>
</body>
</html>