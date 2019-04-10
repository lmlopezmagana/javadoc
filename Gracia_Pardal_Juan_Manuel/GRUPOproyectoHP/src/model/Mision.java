package model;

public class Mision {
	//Creado por Esperanza Macarena Escacena Morcillo
	private boolean superada;
	private Enemigo e;
	private Monstruo m;
	private boolean activada;
	
	public Mision(boolean superada,boolean activada,  Enemigo e, Monstruo m) {
		super();
		this.superada = superada;
		this.activada=activada;
		this.e=e;
		this.m=m;
		
	
	}

	public boolean isSuperada() {
		return superada;
	}

	public void setSuperada(boolean superada) {
		this.superada = superada;
	}

	public Enemigo getE() {
		return e;
	}

	public void setE(Enemigo e) {
		this.e = e;
	}

	public Monstruo getM() {
		return m;
	}

	public void setM(Monstruo m) {
		this.m = m;
	}


	public boolean isActivada() {
		return activada;
	}

	public void setActivada(boolean activada) {
		this.activada = activada;
	}
	
	
	
	
}
