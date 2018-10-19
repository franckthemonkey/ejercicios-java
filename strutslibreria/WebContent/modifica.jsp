<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modificar</title>
</head>
<body>
<h1>Modificación</h1>
<form>
<label>ID</label>
<s:property value="libro.id"/><br>
<label>Título</label>
<input type="text" value="libro.titulo"><br>
<label>Precio</label>
<input type="text" value="libro.precio"><br>
<button type="<s:submit action="modificar.action" />">Modificar
</button>
<button type="<s:submit action="eliminar.action" />">Eliminar</button>

</form>
</body>
</html>