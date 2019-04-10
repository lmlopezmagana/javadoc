package crud;

import model.Enemigo;
import model.Hechizo;

/**
 * 
 * @author Juan Manuel Gracia Pardal
 *
 */
public class CrudEnemigo {

	/**
	 * coge la vida del echizo seleccionado por el usuario y se la resta al enemigo
	 * de la mision.
	 * 
	 * @param h hechizo
	 * @param e Enemigo
	 * @return la vida del enemigo.
	 */
	public static int modificarVidaEnemigo(Hechizo h, Enemigo e) {
		int muerte = 0;
		e.setVida(e.getVida() - h.getDano());

		if (e.getVida() <= 0) {
			e.setVida(muerte);
		}
		return e.getVida();
	}

}