//Juan Manuel Gracia Pardal
package model;

import java.util.Arrays;

public class Mapa {

	// Atributos
	private int alto;
	private int ancho;
	private String[][] tiles;

	// Constructores
	public Mapa(int alto, int ancho, String[][] tiles) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.tiles = tiles;
	}

	public Mapa() {

	}

	// G&S
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String[][] getTiles() {
		return tiles;
	}

	public void setTiles(String[][] tiles) {
		this.tiles = tiles;
	}

	// TS
	@Override
	public String toString() {
		return "ModelMapa [alto=" + alto + ", ancho=" + ancho + ", tiles=" + Arrays.toString(tiles) + "]";
	}

}
