<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculando IMC com JSP</title>
</head>
<body>
<h1>O peso informado é <%=(Double)request.getAttribute("peso") %>.</h1>
<h1>A Altura informado é <%=(Double)request.getAttribute("altura") %>.</h1>
<h1>Resultado: <%= (Double)request.getAttribute("imc") %>.</h1>
<h1>Atenção: <%= (String)request.getAttribute("msg")%>.</h1>
</body>
</html>