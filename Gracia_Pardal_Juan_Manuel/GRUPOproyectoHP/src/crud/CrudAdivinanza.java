package crud;

import model.Adivinanza;

/**
 * 
 * @author Juan Manuel Gracia Pardal
 *
 */

public class CrudAdivinanza {
	
	/**
	 * Metodo que tras recibir la adivinanza y ola respuesta del usuario comprueba si la respuesta es correcta o no.
	 * 
	 * 
	 * @param a recibe una adivinanza 
	 * @param numRespuesta recibe la respuesta dada por el jugador por teclado
	 * @return Boolean
	 */
	public static boolean comprobarRespuesta(Adivinanza a, int numRespuesta) {
		boolean resul=false;
		if(a.getListaRespuestas()[numRespuesta-1].isCorrecto()==true) {
			resul=true;
		}
		
		return resul;
	}

}
