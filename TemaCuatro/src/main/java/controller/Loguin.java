package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Error;
import model.Usuario;
import utiles.Usuarios;


@WebServlet("/Loguin")
public class Loguin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Loguin() {
        super();
    }

    //Este servlet permite crear un nuevo usuario y, si los datos son correctos, guardarlo en la sesion para que no vuelva a pedirlos en la navegacion de la aplicacion.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Tomamos los datos del formulario de Loguin (inputs) para crear nuestro objeto Usuario, para poner en la session
		String usuario = (String)request.getParameter("usuario");
		String password = (String)request.getParameter("password");
		
		Usuarios usuarios = Usuarios.getInstance();
		boolean ok = usuarios.validarUsuario(usuario, password);
		
		if(ok == true) {
			//Instanciamos nuestro Usuario y cargamos los datos recibidos del formulario
			Usuario u = usuarios.getUsuario(usuario);
			
			//Guardamos el Usuario en la session de la aplicacion.
			HttpSession session = request.getSession();
			session.setAttribute("usuario", u);
			
			//Redirigimos a la JSP de bienvenida
			request.getRequestDispatcher("jsp/welcome.jsp").forward(request, response);
		} else {
			
			//Creamos un objeto Error para poder informar de la situacion
			model.Error error = new Error("Usuario incorrecto", "Los datos ingresados para el loguin son incorrectos.");
			request.setAttribute("error", error);
			
			//Redirigimos a la JSP de fallo o error
			request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
