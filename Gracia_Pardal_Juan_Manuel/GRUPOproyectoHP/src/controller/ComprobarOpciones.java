package controller;

import model.Hechizo;

/**
 * @author Juan Manuel Gracia Pardal
 */

public class ComprobarOpciones {
	/**
	 * Metodo creado para avisar si el numero introducido por teclado por el usuario
	 * coincide con un hechizo aprendido del array de listaHechizos. De esta forma
	 * puedo evitar que salga error por salir de los limites del array y cargar
	 * hechizos que no puede o no haya aprendido.
	 * 
	 * @param numElegido: numero introducido por teclado.
	 * @param h: Lista de hechizos.
	 * @return True o false en funcion de si se sale de los limites del array o no.
	 */
	public static boolean avisarTeclaVarita(int numElegido, Hechizo[] h) {
		/*
		 * Método creado para avisar si el número introducido por teclado por el
		 * usuario coincide con un hechizo aprendido del array de listaHechizos. De esta
		 * forma puedo evitar que salga error por salir de los límites del array y
		 * cargar hechizos que no puede o no haya aprendido.
		 */
		boolean resul = false;

		if (numElegido <= h.length && numElegido >= 0 && h[numElegido - 1].isAprendido() == true) {
			resul = true;

		}
		return resul;
	}

}
