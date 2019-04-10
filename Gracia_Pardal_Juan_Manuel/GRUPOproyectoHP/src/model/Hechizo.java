package model;

public class Hechizo {
	//Creado por Esperanza Macarena Escacena Morcillo
	private String nombre;
	private int dano;
	boolean aprendido;
	
	public Hechizo(String nombre, int dano, boolean aprendido) {
		this.nombre = nombre;
		this.dano = dano;
		this.aprendido = aprendido;
	}
	public Hechizo() {
		
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
	public boolean isAprendido() {
		return aprendido;
	}
	public void setAprendido(boolean aprendido) {
		this.aprendido = aprendido;
	}	
}