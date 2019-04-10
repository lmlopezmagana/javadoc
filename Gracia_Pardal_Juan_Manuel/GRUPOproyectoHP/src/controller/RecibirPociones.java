package controller;

import java.util.Random;

import model.Pocion;

/**
 * @author Juan Manuel Gracia Pardal
 */

public class RecibirPociones {
	/**
	 * Cada vez que pase una mision merecedora de pocion, se generara una pocion
	 * aleatoria.
	 * 
	 * @param listaJuego: lista de posibles pociones que hay dentro del juego.
	 * @return Una pocion aleatoria
	 */
	public static Pocion guardarPocionAleatoria(Pocion[] listaJuego) {

		Pocion p1 = new Pocion();
		Random r = new Random(System.nanoTime());
		int min = 0, max = 5, auxiliar = 0;

		do {
			auxiliar = r.nextInt(max - min + 1) + min;
			if (listaJuego[auxiliar] != null) {
				p1 = listaJuego[auxiliar];

			}
		} while (listaJuego[auxiliar] == null);
		listaJuego[auxiliar] = null;
		return p1;
	}
}
