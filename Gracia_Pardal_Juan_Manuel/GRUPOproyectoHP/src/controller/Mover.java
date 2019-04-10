package controller;

import model.PerPpal;

/**
 * @author Juan Manuel Gracia Pardal
 */

public class Mover {
	/**
	 * En la primera parte del metodo (Switch), se soluciona el problema de recibir
	 * una letra mayuscula o minuscula. Despues se comprueba que el movimiento
	 * indicado no se pasa de los limites del array ni entra en ninguna posicion
	 * marcada como null. Si todo es correcto, se setea la posicion actual a blanco
	 * y se pinta las iniciales en la casilla en cuestion.
	 * 
	 * 
	 * 
	 *
	 * 
	 * @param letra: letra que indica el movimiento
	 * @param mapa: el array para poder actuar sobre el.
	 * @param hp: el personaje principal para poder actuar sobre el.
	 * @see "hola lovillo"
	 * 
	 */
	public static void Moverse(char letra, String[][] mapa, PerPpal hp) {
		int hor = 2;
		int ver = 3;
		String blanc = "  ";

		switch (letra) { // investigación StackOverFlow para poder recibir minúsculas y mayúsculas.
		case 'D':
			letra = (char) (letra + 'd' - 'D');

			break;
		case 'A':
			letra = (char) (letra + 'a' - 'A');

			break;
		case 'S':
			letra = (char) (letra + 's' - 'S');
			break;

		case 'W':
			letra = (char) (letra + 'w' - 'W');
			break;
		default:
			break;
		}

		switch (letra) {

		case 'd':

			if (hp.getY() + hor >= 15 || mapa[hp.getX()][hp.getY() + hor] == null) {
				// System.out.println("noup");
			} else {
				mapa[hp.getX()][hp.getY()] = blanc;
				hp.setY(hp.getY() + hor);
				mapa[hp.getX()][hp.getY()] = hp.getIniciales();
			}

			break;

		case 'a':

			if (hp.getY() - hor <= 0 || mapa[hp.getX()][hp.getY() - hor] == null) {
				// System.out.println("noup");
			} else {
				mapa[hp.getX()][hp.getY()] = blanc;
				hp.setY(hp.getY() - hor);
				mapa[hp.getX()][hp.getY()] = hp.getIniciales();

			}
			break;

		case 's':
			if (hp.getX() + ver >= 22 || mapa[hp.getX() + ver][hp.getY()] == null) {
				// System.out.println("noup");
			} else {
				mapa[hp.getX()][hp.getY()] = blanc;
				hp.setX(hp.getX() + ver);
				mapa[hp.getX()][hp.getY()] = hp.getIniciales();

			}

			break;

		case 'w':
			if (hp.getX() - ver <= 0 || mapa[hp.getX() - ver][hp.getY()] == null) {
				// System.out.println("noup");
			} else {
				mapa[hp.getX()][hp.getY()] = blanc;
				hp.setX(hp.getX() - ver);
				mapa[hp.getX()][hp.getY()] = hp.getIniciales();

			}
			break;

		default:

			break;
		}

	}

}
