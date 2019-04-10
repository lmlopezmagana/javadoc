package controller;

import model.Hechizo;
import model.Mision;
import model.ObjetoMag;
import model.PerPpal;
import model.Pocion;

/**
 * @author Juan Manuel Gracia Pardal
 */

public class ResetearPartida {
	/**
	 * Este metodo reiniciar, reinicia todos los datos guardados durante una partida
	 * para empezar el juegode nuevo.
	 * 
	 * @param hp: El objeto PerPpal para poder settear vida, daño, etc.
	 * @param h: QWue hechizo usa para luchar.
	 * @param o: Que objeto magico usa, si usa alguno.
	 * @param p: Que pocion usa, si usa alguna.
	 * @param hEnemigo: Enemigo contra el que se enfrenta.
	 * @param listaM: La mision en la que se encuentra el personaje.
	 * @param mapa: Posicion en el mapa.
	 * 
	 */
	public static void reiniciar(PerPpal hp, Hechizo[] h, ObjetoMag[] o, Pocion[] p, Hechizo[] hEnemigo,
			Mision[] listaM, String[][] mapa) {
		int vida = 100, hechizosNoPredeterm = 3, bondad = 100, indiceJager = 3, vidaTroll = 75, vidaDraco = 80, x = 2,
				y = 1;
		for (int i = 0; i < o.length; i++) {
			o[i].setEncontrado(false);

		}
		for (int i = hechizosNoPredeterm; i < h.length; i++) {
			h[i].setAprendido(false);
		}

		for (int i = 0; i < indiceJager; i++) {
			p[i] = new Pocion("Beerus", 0, 20);
		}
		for (int i = indiceJager; i < p.length; i++) {
			p[i] = new Pocion("Jagermeisterus", 0, 50);
		}
		for (int i = 0; i < hEnemigo.length; i++) {
			hEnemigo[i] = null;
		}
		listaM[1].getM().setVida(vidaTroll);
		listaM[4].getE().setVida(vidaDraco);

		mapa[hp.getX()][hp.getY()] = "  ";
		hp.setVida(vida);
		hp.setBondad(bondad);
		hp.setX(x);
		hp.setY(y);
		mapa[hp.getX()][hp.getY()] = "HP";

		for (int i = 0; i < hp.getMochila1().getListaBeerus().length; i++) {
			hp.getMochila1().getListaBeerus()[i] = null;
			hp.getMochila1().getListaJager()[i] = null;
		}

	}
}
