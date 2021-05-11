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


@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Tomamos los datos del formulario de registro (inputs) para actualizar el Usuario, para poner en la session
		String nombre = (String)request.getParameter("nombre");
		String email = (String)request.getParameter("email");
		int edad = Integer.parseInt((String)request.getParameter("edad"));
		
		//Completamos los datos del usuario en sesion con los cargados en el formulario
		Usuario usuario = (Usuario)request.getSession().getAttribute("usuario");
		if(usuario == null) {
			usuario = new Usuario();
			usuario.usuario = (String)request.getParameter("usuario");
			usuario.password = (String)request.getParameter("password");
			request.getSession().setAttribute("usuario", usuario);
		}
		usuario.nombre = nombre;
		usuario.email = email;
		usuario.edad= edad;
		usuario.tieneDatosCargados = true;
		
		//Actualiazmos los datos del usuario registrado en memoria con los datos que se cargaron.
		Usuarios usuarios = Usuarios.getInstance();
		usuarios.registrarUsuario(usuario);
			
		//Redirigimos a la JSP de bienvenida
		request.getRequestDispatcher("jsp/welcome.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
