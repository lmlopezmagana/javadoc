package crud;

import controller.RecibirPociones;
import model.Mochila;
import model.PerPpal;
import model.Pocion;

/**
 * 
 * @author Juan Manuel Gracia Pardal
 *
 */
public class CrudMochila {

	/**
	 * Usa la pocion que dice el jugador por teclado y la borra del array de
	 * pociones.
	 * 
	 * @param hp     personaje principal.
	 * @param p      pocion.
	 * @param indice posicion de la pocion.
	 * @return pocion.
	 */
	public static Pocion[] tomarPocion(PerPpal hp, Pocion[] p, int indice) {
		int vidaMax = 100;
		if (indice >= 0 && hp.getVida() < vidaMax) {
			CrudPerPpal.tomarPocion(hp, p[indice]);
			p[indice] = null;
		}

		return p;
	}

	/**
	 * Recorre el array de pociones hasta encontrar un sitio vacio y guarda ahi la
	 * pocion de recompensa. En caso de estar todo lleno, devuelve que la mochila de
	 * pociones ya esta llena.
	 * 
	 * @param lista array de pociones.
	 * @return una variable temporal.
	 */
	public static int comprobarVacioMochila(Pocion[] lista) {
		int indiceVacio = 0, contadorLleno = 0, llena = -1;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				indiceVacio = i;
				break;
			} else {
				contadorLleno++;
				if (contadorLleno == 3) {
					indiceVacio = llena;

				}
			}
		}
		return indiceVacio;
	}

	/**
	 * Con la lista de pociones comprueba si esta vacia o no. Si esta vacia le
	 * asigna un numero negativo.
	 * 
	 * @param lista lista de piciones
	 * @return variable temporal
	 */
	public static int comprobarLlenoMochila(Pocion[] lista) {
		int indiceLleno = 0, contadorVacio = 0, vacio = -1;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				indiceLleno = i;
				break;
			} else {
				contadorVacio++;
				if (contadorVacio == 3) {
					indiceLleno = vacio;

				}
			}
		}
		return indiceLleno;
	}

	/**
	 * Este metodo se usa para generar una pocion aleatoria y guardarla en una
	 * posicion de la mochila que este guardada como vacia.
	 * 
	 * 
	 * @param m          mochila
	 * @param listaJuego lista de pociones posibles.
	 * @return mochila
	 */
	public static Mochila cargarPocion(Mochila m, Pocion[] listaJuego) {
		int i = 0, llena = -1;
		Pocion p1 = new Pocion();
		String nomB = "Beerus", nomJ = "Jagermeisterus";

		p1 = RecibirPociones.guardarPocionAleatoria(listaJuego);

		if (p1.getNombre().equals(nomB)) {
			i = comprobarVacioMochila(m.getListaBeerus());

			if (i != llena) {
				m.getListaBeerus()[i] = p1;
			}
		} else if (p1.getNombre().equals(nomJ)) {
			i = comprobarVacioMochila(m.getListaJager());

			if (i != llena) {
				m.getListaJager()[i] = p1;
			}

		}

		return m;
	}

	/**
	 * Cuenta las pociones que hay de cada tipo y las devuelve.
	 * 
	 * @param lista lista de pociones
	 * @return cantidad variable temporal
	 */
	public static int contarPocion(Pocion[] lista) {

		int cantidad = 0, cantidadNulo = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				cantidad++;

			} else {
				cantidadNulo++;
			}
		}
		if (cantidadNulo == 3) {
			cantidad = 0;
		}
		return cantidad;
	}

}