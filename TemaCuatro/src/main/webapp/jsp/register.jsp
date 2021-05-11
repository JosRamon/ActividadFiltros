<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de usuario</title>
</head>

<body bgcolor="greenyellow">	
	<h1>Registro de nuevo usuario</h1>
	<h3>Cargue los datos necesarios</h3>
	<hr />
	
	<form id="idForm" action="<%=request.getContextPath() %>/RegistrarUsuario" method="post">
         Usuario:<br>
         <input type="text" name="usuario" id="usuario" value=""><br>
         Contraseña:<br>
         <input type="password" name="password" id="password" value=""><br>
         Nombre:<br>
         <input type="text" name="nombre" id="nombre" value=""><br>
         Email:<br>
         <input type="text" name="email" id="email" value=""><br>
         edad:<br>
         <input type="text" name="edad" id="edad" value=""><br><br>
         
         <input type="submit" value="Registrar"><br><br>

     </form>
	
	<br>
	<input type="button" onclick="history.back()" value="Volver">
</body>
</html>