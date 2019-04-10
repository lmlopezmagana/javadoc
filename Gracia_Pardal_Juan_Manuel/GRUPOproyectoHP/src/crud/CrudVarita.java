package crud;

import java.util.Random;
import model.Hechizo;
import model.Varita;

public class CrudVarita {
	/**
	 * Se genera un numero aleatorio y se guarda, si el primer espacio que encuentra
	 * es null, significa que puede guardar un hechizo ahi, si no, se comparan los
	 * nombres de los hechizos para que no haya repetidos. Si no coinciden os
	 * nombres, guarda el hechizo y si coincide, se repite el proceso.
	 * 
	 * @param v: la varita para poder actuar sobre ella.
	 * @param lista: la lista para poder recorrerla y actuar sobre ella.
	 * @return la varita con el hechizo cargado.
	 */
	public static Varita cargarHechizosEnemigo(Varita v, Hechizo[] lista) {
		Random r = new Random(System.nanoTime());
		int min = 0, max = 3, auxiliar = 0;
		boolean comprobar = false;

		for (int i = 0; i < v.getH1().length; i++) {
			comprobar = false;
			auxiliar = r.nextInt(max - min + 1) + min;

			for (int j = 0; j < v.getH1().length; j++) {
				if (v.getH1()[j] == null) {
					comprobar = true;
					break;
				} else if (lista[auxiliar].getNombre().equals(v.getH1()[j].getNombre())) {

					comprobar = false;
					break;
				}
			}
			if (comprobar == true) {
				v.getH1()[i] = lista[auxiliar];
			} else {
				i--;
			}
		}
		return v;
	}

	/**
	 * Carga los echizos que manda el usuario por teclado en la varita.
	 * 
	 * @param i     parametros del anterior metodo @see public static Varita
	 *              cargarHechizosEnemigo(Varita v, Hechizo[] lista)
	 * @param j     parametros del anterior metodo @see public static Varita
	 *              cargarHechizosEnemigo(Varita v, Hechizo[] lista)
	 * @param v     Parametros del anterior metodo @see public static Varita
	 *              cargarHechizosEnemigo(Varita v, Hechizo[] lista)
	 * @param lista Parametros del anterior metodo @see public static Varita
	 *              cargarHechizosEnemigo(Varita v, Hechizo[] lista)
	 * @return La varita con los echizos cargados
	 */
	public static Varita cargarHechizoTeclado(int i, int j, Varita v, Hechizo[] lista) {
		i--;
		j--;
		v.getH1()[i] = lista[j];
		return v;
	}
}