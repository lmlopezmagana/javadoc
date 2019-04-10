package controller;

import java.util.Random;
import model.Hechizo;
import model.Varita;

/**
 * 
 * @author Juan Manuel Gracia Pardal
 */

public class Ataques {
	/**
	 * 
	 * Este metodo realiza una eleccion aleatoria de los hechizos de la varita de
	 * los enemigos para que ataquen a Harry Potter.
	 * 
	 * @param v: La varita de los enemigos
	 * @return El hechizo con el que atacan al personaje principal.
	 */
	public static Hechizo atacarEnemigo(Varita v) {

		Random r = new Random(System.nanoTime());
		int i = 0, min = 0, max = 2;

		i = r.nextInt(max - min + 1) - min;

		return v.getH1()[i];
	}

}
