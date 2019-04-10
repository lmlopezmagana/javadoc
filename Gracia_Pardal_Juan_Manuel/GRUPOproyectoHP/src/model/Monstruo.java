package model;

//Hecho por Pablo Rodríguez

public class Monstruo {
	
	private String raza;
	private int vida,dano;
	
	public Monstruo() {
		super();
	}

	public Monstruo(String raza, int vida, int dano) {
		super();
		this.raza = raza;
		this.vida = vida;
		this.dano = dano;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	@Override
	public String toString() {
		return "Monstruo [raza=" + raza + ", vida=" + vida + ", da�o=" + dano + "]";
	}
	
	
	

}
