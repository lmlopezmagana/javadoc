package model;

//Hecho por Pablo Rodríguez

public class PerPpal {
	
private String nombre,apellido,casa,iniciales;
private int vida,bondad, x, y;
Mochila mochila1;
Varita v;

public PerPpal() {
	super();
}

public PerPpal(String nombre, String apellido, String casa, String iniciales, int vida, int bondad,int x, int y,
		Mochila mochila1,Varita v) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.casa = casa;
	this.iniciales = iniciales;
	this.vida = vida;
	this.bondad = bondad;
	this.x=x;
	this.y=y;
	this.mochila1 = mochila1;
	this.v=v;
}

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

public String getCasa() {
	return casa;
}

public void setCasa(String casa) {
	this.casa = casa;
}

public String getIniciales() {
	return iniciales;
}

public void setIniciales(String iniciales) {
	this.iniciales = iniciales;
}

public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida;
}

public int getBondad() {
	return bondad;
}

public void setBondad(int bondad) {
	this.bondad = bondad;
}

public Mochila getMochila1() {
	return mochila1;
}

public void setMochila1(Mochila mochila1) {
	this.mochila1 = mochila1;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public Varita getV() {
	return v;
}

public void setV(Varita v) {
	this.v = v;
}




}