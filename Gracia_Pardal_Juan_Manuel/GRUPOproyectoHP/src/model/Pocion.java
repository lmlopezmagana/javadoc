package model;

public class Pocion {
	//Creado por Esperanza Macarena Escacena Morcillo
	private String nombre;
	private int dano;
	private int vida;

	public Pocion(String nombre, int dano, int vida) {
		
		this.nombre = nombre;
		this.dano = dano;
		this.vida = vida;
	}
	
	public Pocion() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	
}
