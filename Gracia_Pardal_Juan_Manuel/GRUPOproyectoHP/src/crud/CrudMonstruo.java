package crud;

import model.Hechizo;
import model.Monstruo;

/**
 * 
 * @author Juan Manuel Gracia Pardal
 *
 */
public class CrudMonstruo {

	/**
	 * Coge la vida del monstruo, le resta el daño del echizo y devuelve al monstruo
	 * con la vida seteada.
	 * 
	 * @param monstruo1 monstruo de la mision
	 * @param hechizo1  echizo elegido por el jugador
	 * @return monstruo
	 */
	public static Monstruo quitarVidaMons(Monstruo monstruo1, Hechizo hechizo1) {

		monstruo1.setVida(monstruo1.getVida() - hechizo1.getDano());
		if (monstruo1.getVida() < 0) {
			monstruo1.setVida(0);
		}
		return monstruo1;
	}
}
