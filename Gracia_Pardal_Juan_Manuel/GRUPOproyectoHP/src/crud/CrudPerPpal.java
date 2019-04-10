package crud;

import model.Enemigo;
import model.Hechizo;
import model.Monstruo;
import model.PerPpal;
import model.Pocion;
import controller.Ataques;

public class CrudPerPpal {

	/**
	 * coge el da�o del monstruo se lo resta a la vida del personaje principal y lo
	 * devuelve.
	 * 
	 * @param monstruo1 monstruo de la mision
	 * @param pj1       personaje principal
	 * @return personaje principal
	 */
	public static PerPpal quitarVidaPjMons(Monstruo monstruo1, PerPpal pj1) {
		int muerte = 0;
		// método para cuando le quita vida un Monstruo
		pj1.setVida(pj1.getVida() - monstruo1.getDano());
		if (pj1.getVida() <= 0) {
			pj1.setVida(muerte);
		}
		return pj1;
	}

	/**
	 * Coge el da�o que hace el enemigo y se lo quita a la vida del personaje y lo
	 * devuelve.
	 * 
	 * @param pj1 personaje principal
	 * @param e   enemigo
	 * @return Personaje principal
	 */
	public static PerPpal quitarVidaPjHechiz(PerPpal pj1, Enemigo e) {
		int muerte = 0;
		Hechizo h = new Hechizo();
		h = Ataques.atacarEnemigo(e.getV());
		pj1.setVida(pj1.getVida() - h.getDano());
		if (pj1.getVida() < 0) {
			pj1.setVida(muerte);
		}
		return pj1;

	}

	/**
	 * Con el personaje y la pocion especificada por el usuario modifica la salud y
	 * devuelve el personaje tras la modificacion.
	 * 
	 * @param pj1     personaje principal
	 * @param pocion1 La pocion escogida por teclado
	 * @return Personaje principal
	 */
	public static PerPpal tomarPocion(PerPpal pj1, Pocion pocion1) {
		int vidaMax = 100;
		if (pj1.getVida() < vidaMax) {// si la vida no está al máximo entonces suma la poción
			pj1.setVida(pj1.getVida() + pocion1.getVida());
			if (pj1.getVida() > vidaMax) {// y si supera la vida máxima, setea a vida máxima, no más.
				pj1.setVida(vidaMax);
			}
		}
		return pj1;
	}

	/**
	 * Cada vez que hay que modificar la bondad del personaje se llama a este metodo
	 * y devuelve el personaje conla bondad modificada.
	 * 
	 * @param pj1    Personaje principal
	 * @param puntos La cantidad de puntos que modifica
	 * @return El personaje principal
	 */
	public static PerPpal modificarBondad(PerPpal pj1, int puntos) {
		int bondadPlena = 100, maldadPlena = 0;
		pj1.setBondad(pj1.getBondad() + puntos);
		if (pj1.getBondad() < maldadPlena) {
			pj1.setBondad(maldadPlena);// límite para que no sea menor de 0

		} else if (pj1.getBondad() > bondadPlena) {// otro límite para que no sea mayor de 100
			pj1.setBondad(bondadPlena);
		}
		return pj1;
	}

}
