<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page import="model.Triangulo"%>

<% 
    Triangulo triangulo = (Triangulo) request.getAttribute("triangulo");  
 %>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TRIANGULO</title>
    </head>
    <body bgcolor="greenyellow">
    	
    	<h1>TRIANGULO</h1>
    	<h2>Resultado de los c&aacute;lculos</h2>
    	<hr />
    	
        <h3>Area: <%=triangulo.getArea()  %></h3>
        <h3>Perimetro: <%=triangulo.getPerimetro()  %></h3>
        
        <br />
        <a href="<%=request.getContextPath() %>/jsp/triangulo/ingresarDatos.jsp">Ingresar nuevos datos</a><br>
 		<a href="<%=request.getContextPath() %>/Inicio">Inicio</a><br>
 		<a href="<%=request.getContextPath() %>/Logout">Cerrar Sesion</a><br>
        
        
        
    </body>
</html>
