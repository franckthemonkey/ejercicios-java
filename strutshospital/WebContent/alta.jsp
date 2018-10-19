<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Alta</h1>
	<s:form action="alta">
		<s:textfield name="paciente.nombre"
			label="Introduce el nombre del paciente" />
		<br>
		<s:textfield name="paciente.apellido"
			label="Introduce el primer apellido del paciente" />
		<br>


		<s:submit value="Alta" />

	</s:form>
</body>
</html>