/**
 * 
 */
package modelo;

/**
 * Clase que modela a una Persona del mundo real
 * @author lmlopez
 * @see "Mira a otras personas de tu alrededor"
 */
public class Persona {

	private String nombre;
	
	/**
	 * Constructor de una persona
	 * @param n Nombre de la persona
	 */
	public Persona(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
