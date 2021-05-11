<%@page import="model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido</title>
</head>
<body bgcolor="greenyellow">
	
	<h1>Bienvenido <%=usuario.usuario %></h1>
	<br />
	
	<%
	if(usuario.tieneDatosCargados){
		//MOstramos los datos del usuario
	%>
		<p>Nombre: <%=usuario.nombre %></p>
		<p>Email: <%=usuario.email %></p>
		<p>Edad: <%=usuario.edad %></p>
	
	<%	
	} else {
		//Mostramos el formulario con los datos del registro
	%>	
		<form id="idFormRegistro" action="<%=request.getContextPath() %>/RegistrarUsuario" method="post">
			Nombre:<br>
            <input type="text" name="nombre" id="nombre" value=""><br>
            Email:<br>
            <input type="text" name="email" id="email" value=""><br>
            edad:<br>
            <input type="text" name="edad" id="edad" value=""><br><br>
            
            <input type="submit" value="Registrar"><br><br>
		</form>
	<%	
	}
	
	%>
	
	<a href="<%=request.getContextPath() %>/jsp/triangulo/ingresarDatos.jsp">Calcular datos de tri&aacute;ngulos</a><br>
	<a href="<%=request.getContextPath() %>/jsp/listaUsuarios.jsp">Ver usuarios registrados</a><br>
	<a href="<%=request.getContextPath() %>/Logout">Cerrar Sesion</a><br>

</body>
</html>