package utiles;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import model.Usuario;

public class Usuarios {

	private Map<String, Usuario> usuariosRegistrados = new HashMap<String, Usuario>();
	private static Usuarios instance = null;
 
    public static Usuarios getInstance() {
        if (instance == null) {
            instance = new Usuarios();
        }
        return instance;
    }
    
	protected Usuarios() {
		cargarUsuarios();
	}
	
	private void cargarUsuarios() {
		Usuario u = new Usuario();
		u.usuario = "ramon";
		u.password = "ramon";
		u.nombre = "Jose Ramon";
		u.email = "ramon@gmail.com";
		u.edad = 25; // :-)
		u.tieneDatosCargados = true;
		usuariosRegistrados.put(u.usuario, u);		
	}
	
	//Valida que el usuario y password recibido sean correctos
	public boolean validarUsuario(String usuario, String password) {
		//Obtengo el password del mapa
		Usuario u = usuariosRegistrados.get(usuario);
		if(u==null) {
			//El usuario no existe
			return false;
		} else if(!u.password.equals(password)) {
			//El password no coincide con el almacenado
			return false;
		}
		return true;
	}
	
	//Permite registrar en la aplicacion un nuevo usuario
	public void registrarUsuario(Usuario u) {
		usuariosRegistrados.put(u.usuario, u);
	}
	
	//Este metodo retorna un objeto Usuario de la lista de usuarios registrados.
	public Usuario getUsuario(String usuario) {
		return usuariosRegistrados.get(usuario);
	}
	
	//Retorna una coleccion con los usuarios registrados
	public Collection<Usuario> getUsuarios(){
		return usuariosRegistrados.values();
	}
	
}
