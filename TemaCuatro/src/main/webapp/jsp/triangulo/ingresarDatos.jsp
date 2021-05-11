
<%@ page language="java" contentType="text/html;charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carga de datos para el triangulo</title>
    </head>
   
    <body bgcolor="greenyellow">
    
    	<h1>TRIANGULO</h1>
    	<h2>Ingrese los datos necesarios</h2>
    	
        <form id="idForm" action="<%=request.getContextPath() %>/ServletTriangulo" method="post">
            Base:<br>
            <input type="text" name="base" value=""><br>
            Altura:<br>
            <input type="text" name="altura" value=""><br><br>
            
            <input type="submit" value="Calcular"><br><br>
        </form>
        
 		<br />
 		<a href="<%=request.getContextPath() %>/Inicio">Inicio</a><br>
 		<a href="<%=request.getContextPath() %>/Logout">Cerrar Sesion</a><br>
 
 
    </body>
</html>
