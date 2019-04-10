//Juan Manuel Gracia Pardal
package model;

public class Enemigo {

	// atributos
	private String nombre;
	private String apellido;
	private int vida;
	private Varita v;

	// Constructores
	public Enemigo(String nombre, String apellido, int vida,Varita v) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.vida = vida;
		this.v=v;
	}

	public Enemigo() {

	}

	// G&S
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public Varita getV() {
		return v;
	}

	public void setV(Varita v) {
		this.v = v;
	}

	// TS
	@Override
	public String toString() {
		return "ModelEnemigo [nombre=" + nombre + ", apellido=" + apellido + ", vida=" + vida + "]";
	}

}
