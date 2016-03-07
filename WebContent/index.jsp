<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculo IMC</title>
</head>
<body>
	<h1>Digite os dados:</h1>
	<form method="post" action="/WProjeto1/servletimc">
	<p>Peso: <input type="text" size="10" name="peso"/></p>
	<p>Altura: <input type="text" size="10" name="altura"/></p>
	<p> <input type="submit" value="Calcular"/> </p>
	</form>
</body>
</html>