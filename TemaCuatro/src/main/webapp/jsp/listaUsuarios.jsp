<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<%@page import="model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="utiles.Usuarios"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Usuarios</title>

<%
	Usuarios usuarios = Usuarios.getInstance();
	Collection<Usuario> usuariosRegistrados = usuarios.getUsuarios();
	
%>

</head>

<body bgcolor="greenyellow">

	<h1>LISTA DE USUARIOS REGISTRADOS</h1>

	<%	for (Usuario usuario : usuariosRegistrados) { %>
		
		<h3>Usuario: <%=usuario.usuario %></h3><hr />
		<p>Password: <%=usuario.password %></p>
		<p>Nombre: <%=usuario.nombre %></p>
		<p>Email: <%=usuario.email %></p>
		<p>Edad: <%=usuario.edad %></p>
		<hr />
		<br />
	
    <% } %>
    
    <br>
    <a href="<%=request.getContextPath() %>/Inicio">Inicio</a><br>
    <a href="<%=request.getContextPath() %>/Logout">Cerrar Sesion</a><br>
    
</body>
</html>