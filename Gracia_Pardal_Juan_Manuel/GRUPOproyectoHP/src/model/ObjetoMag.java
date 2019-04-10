package model;

//Hecho por Pablo Rodríguez

public class ObjetoMag {
	
	private String nombre;
	private boolean encontrado;
	
	public ObjetoMag() {
		super();
	}

	public ObjetoMag(String nombre, boolean encontrado) {
		super();
		this.nombre = nombre;
		this.encontrado = encontrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEncontrado() {
		return encontrado;
	}

	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}

	@Override
	public String toString() {
		return "objetoMag [nombre=" + nombre + ", encontrado=" + encontrado + "]";
	}
	
	
	

}
