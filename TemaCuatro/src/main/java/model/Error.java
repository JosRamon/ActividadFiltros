package model;


/**
 * Esta clase permite registrar los datos de un error que se produzca para informar en pantalla.
 * 
 */
public class Error {

	public String titulo;
	public String mensaje;
	
	//Constructor con los parametros necesarios
	public Error(String t, String m) {
		titulo = t;
		mensaje = m;
	}
	
	//Constructor sin parametros. Cargamos un string vacio en cada propiedad.
	public Error() {
		titulo = "";
		mensaje = "";
	}
	
}
