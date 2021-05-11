package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Inicio() {
        super();
    }

    //Se va a verificar si existe un usuario logueado, en caso de no haber uno se redirije a la pagina de loguin, y en caso de haber uno
    //se redirige a la pagina de bienvenida.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
//		Usuario u = (Usuario)request.getSession().getAttribute("usuario");
//		if(u == null) {
//			 request.getRequestDispatcher("jsp/loguin.jsp").forward(request, response);
//			
//		} else {
			 request.getRequestDispatcher("jsp/welcome.jsp").forward(request, response);
			
//		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
