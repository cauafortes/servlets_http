<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>RequestBody Formulário</title>
</head>
<body>
	<form action="request-body" method="post">
	    Nome: <input type="text" name="nome"><br>
	    Email: <input type="email" name="email"><br>
	    Mensagem: <textarea name="mensagem"></textarea><br>
	    <input type="submit" value="Enviar">
	</form>
</body>
</html>