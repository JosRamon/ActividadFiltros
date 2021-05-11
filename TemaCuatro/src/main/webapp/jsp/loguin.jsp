<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGUIN</title>
</head>

<body bgcolor="greenyellow">

<h1>Iniciar sesion</h1>
		<form id="idForm" action="<%=request.getContextPath() %>/Loguin" method="post">
            Usuario:<br>
            <input type="text" name="usuario" id="usuario" value=""><br>
            Contraseña:<br>
            <input type="password" name="password" id="password" value=""><br><br>
            
            <input type="submit" value="Loguin"><br><br>
        </form>
<br />
<br />

<a href="<%=request.getContextPath() %>/jsp/register.jsp">Registar nuevo usuario</a><br>
</body>
</html>