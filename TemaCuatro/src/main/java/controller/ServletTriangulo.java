package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Triangulo;


//@WebServlet("/ServletTriangulo")
@WebServlet(name = "ServletTriangulo", urlPatterns = {"/ServletTriangulo"})
public class ServletTriangulo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public ServletTriangulo() {
    }

    /* 
    Este metodo se invoca desde doGet y doPost, porque en este servlet, no nos interesa el tipo de requerimiento, es decis, 
    nos da lo mismo si es por GET o POST, ejecutamos un metodo comuno a los dos tipos de requerimiento.
    Esto nos permite no replicar codigo en ambos metodos.
    */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Indicamos al navegador que la respuesta sera una pagina HTML (luego de que la JSP se procese en el servidor, se retorna un
		// HTML. Si esta linea no se pone, el navegador interpreta automaticamente la respuesta.
		response.setContentType("text/html;charset=UTF-8");
        
           //Se toman los datos del formulario enviado (base y altura) 
			double base = Double.parseDouble(request.getParameter("base"));
           double altura = Double.parseDouble(request.getParameter("altura"));
          
           //Creamos con los datos obtenidos una instancia del objeto Triangulo
           Triangulo triangulo = new Triangulo(base, altura);
           
           //Ponemos en el request (requerimiento) el objeto Triangulo, para poder usarlo en la JSP de respuesta
           request.setAttribute("triangulo", triangulo);
           //Indicamos que la navegacion continue en la url "jsp/mostrarResultadoServlet.jsp", la busca dentro de la carpeta "webapp" (relativo a esta carpeta)
           request.getRequestDispatcher("jsp/triangulo/mostrarResultados.jsp").forward(request, response);
           
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Desde el metodo doGet invocamos al metodo de esta misma clase "service"
		service(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Desde el metodo doPost invocamos al metodo de esta misma clase "service"
		service(request, response);
	}

}
