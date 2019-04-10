package vistas;

import model.Mochila;
import model.PerPpal;

public class Plantillas {
	// Toda creado por Esperanza Macarena Escacena Morcillo
	public static void imprimirPlantillaMisiones(String dibujo, String dialogo, PerPpal hp) {
		String h = "\u2586";
		String v = "\u258A";

		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  " + v);
		System.out.print(dibujo);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + "\t\t\t\t\t\t\t\t  " + v);
		System.out.println(v + "\t\t\t\t\t\t\t\t\t " + v + "\t Harry Potter ♥" + hp.getVida() + "\t\t\t\t\t  " + v);
		System.out.println(dialogo);
		System.out.println(v + "\t\t\t\t\t\t\t\t\t " + v + "\t\t\t\t\t\t\t\t  " + v);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
	}

	// Diseñado por Esperanza Escacena Morcillo (plantilla) y Juan Manuel Gracia
	// Pardal(escritura de los créditos y encuadre en la plantilla)
	public static void imprimirCreditos() throws InterruptedException {
		String h = "\u2588", g = "\u2593";
		int filas = 9, filas2 = 10, seg = 200, sLargo = 500;
		for (int i = 0; i < filas; i++) {
			System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
			Thread.sleep(seg);
		}
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + " " + " " + " "
				+ " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h
				+ " " + " " + h + h + h + h + h + h + h + h + h + h + h + " " + h + h + h + h + h + h + h + h + h + " "
				+ " " + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h
				+ h + " " + " " + h + h + " " + " " + " " + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h
				+ h + " " + h + h + h + h + h + h + h + " " + " " + " " + " " + " " + " " + h + h + h + h + h + h + h
				+ " " + " " + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h
				+ " " + " " + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h
				+ h + " " + " " + " " + " " + h + h + h + " " + " " + h + h + h + h + h + " " + h + h + h + " " + " "
				+ " " + " " + " " + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + " " + " " + " "
				+ " " + " " + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h
				+ h + " " + " " + h + h + " " + h + h + " " + " " + " " + " " + " " + " " + " " + h + h + h + " " + " "
				+ h + h + " " + " " + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + " " + " " + h + h + h
				+ " " + " " + h + h + " " + " " + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h
				+ h + " " + " " + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + " " + " " + h + h
				+ " " + " " + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + " " + " " + h + h + h + " "
				+ " " + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + " " + " " + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + " " + " " + " " + " " + " " + " " + h + h + h + h + h
				+ " " + " " + " " + " " + " " + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + " "
				+ " " + " " + " " + " " + h + h + h + " " + " " + " " + " " + " " + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Coordinator: Esperanza Escacena    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Public Relations: Juan Gracia      " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Secretary: Pablo Rodríguez         " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Investigator: Juan Gracia\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Screenwriter: Pablo Rodríguez\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "     Graphic designer: Esperanza Escacena   " + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t       Juan Gracia\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t       Pablo Rodríguez\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Story line: Esperanza Escacena\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t     Juan Gracia\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t     Pablo Rodríguez\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Testers: Esperanza Escacena\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t  Juan Gracia\t            " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t  Pablo Rodríguez\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t External tester: Daniel Leiva\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ " Expert advisory on HP: Cuñada de Esperanza " + h + h + h + h + h + h + g + g + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Assembler: Esperanza Escacena\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t  Platform: Java\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Programmer: Esperanza Escacena\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t     Juan Gracia\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t     Pablo Rodríguez\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Project manager: Angel Naranjo\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t Producer: Salesianos de Triana\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h
				+ "\t\t\t\t\t    " + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		Thread.sleep(seg);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);

		for (int i = 0; i < filas2; i++) {
			Thread.sleep(seg);
			System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		}
		Thread.sleep(sLargo);

	}

	// Diseñado por Esperanza Escacena (plantilla y título) y Juan Manuel Gracia
	// Pardal (diálogo de instrucciones, aviso sobre decisiones, pegi, etc)
	public static void imprimirInicio() {
		String h = "\u2588", g = "\u2593";
		int filas = 9, filas2 = 5;
		for (int i = 0; i < filas; i++) {
			System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		}
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + " "
				+ " " + " " + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + " " + " " + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h
				+ " " + " " + h + h + h + h + h + h + h + h + " " + " " + " " + " " + " " + " " + h + " " + " " + " "
				+ " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + " " + " " + " " + " " + h + h + h + h
				+ " " + h + h + h + h + h + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + " "
				+ " " + h + h + h + h + h + h + h + h + h + h + h + h + " " + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + " " + " " + " " + " " + " " + " " + h + h + h + " " + h + h + " " + " " + h
				+ h + h + " " + " " + " " + h + h + h + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + " " + " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h
				+ h + h + " " + " " + h + h + h + h + " " + " " + " " + " " + h + h + h + h + " " + " " + " " + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h
				+ " " + " " + h + " " + h + h + " " + " " + h + " " + h + h + " " + " " + h + h + " " + " " + h + h + h
				+ h + h + " " + " " + " " + " " + h + h + h + h + h + " " + " " + " " + h + h + h + h + " " + " " + h
				+ h + h + h + h + " " + " " + h + h + h + " " + " " + h + h + " " + " " + h + h + h + " " + " " + h
				+ " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + " " + " " + " " + " " + " " + h + h
				+ h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + " " + " " + h + h + h
				+ h + h + " " + " " + h + h + h + h + h + " " + " " + h + h + h + " " + " " + h + h + " " + " " + h + h
				+ h + h + h + " " + " " + h + h + h + " " + " " + " " + " " + " " + " " + h + h + h + " " + " " + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + " " + " " + h + h + " " + " " + h + h + h
				+ " " + " " + h + h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + " " + " " + h + h + h + h
				+ h + " " + " " + h + h + h + h + h + " " + " " + h + h + h + " " + " " + h + h + " " + " " + h + h + h
				+ h + h + " " + " " + h + h + h + " " + " " + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + " " + " " + h + h + h + h + " " + " " + h + h + h + " " + " " + " " + " " + " " + " " + h
				+ h + " " + " " + h + h + h + h + " " + " " + h + h + h + h + h + " " + " " + " " + " " + " " + h + h
				+ h + h + h + " " + " " + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + " " + " " + h
				+ h + h + h + h + " " + " " + h + h + h + h + " " + " " + " " + h + h + h + h + h + " " + " " + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + " " + " " + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + " " + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + " " + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + g + g + "   Todas  las  decisiones   " + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + g + g + "    tienen  consecuencia    " + g + g + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + g + g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + h + " " + " " + " " + " " + " " + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + "\t  [1]EMPEZAR\t [0]SALIR    " + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + h + " +" + "1" + "6 " + h + g + g + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + g + g + g
				+ "      [a]-->Izquerda  [d]-->Derecha  [w]-->Subir  [s]-->Bajar \t" + g + g + g + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + h + " " + " " + " " + " " + " " + h + g + g + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g + g
				+ g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + h + h + h + h + h + h + h + g + g + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + g + g + g + g + g + g + g + g + g + g + g + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);

		for (int i = 0; i < filas2; i++) {
			System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		}
	}

	public static void imprimirFin() {
		String h = "\u2588";
		int filas = 9;
		for (int i = 0; i < filas; i++) {
			System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		}
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + " " + " " + " " + " " + " " + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + " " + " " + " " + " " + " " + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + " " + " " + " " + h + h + h + h + h + h + h + " "
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + " " + " " + " " + h + h + h + " " + " " + h + h + h
				+ " " + " " + " " + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + " " + h + h + h + h + h + h + " " + " " + h + h + h + " "
				+ " " + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + " " + " " + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + "Pulsa Intro" + h + h + h + h + h + h + h + h
				+ h + h);
		for (int i = 0; i < filas; i++) {
			System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
					+ h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		}

	}

	public static void imprimirMochila(Mochila m) {
		String h = "\u2586";
		String v = "\u258A";
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  " + v);
		System.out.println(v + "\t\t\t\t\t\t\t OBJETOS MAGICOS \t\t\t\t\t\t\t\t  " + v);
		System.out.print(v + "\t" + m.getListaObjetos()[0].getNombre() + v); // **************
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + "\t\t\t\t\t\t\t\t\t  " + v);
		System.out.println(v + "\t\t\t\t\t\t\t\t " + v + "\t\t\t\t\t\t\t\t\t  " + v);

		// System.out.println("\t\t\t\t\t\t\t\t\t "+v);
		System.out.println(v + "\t\t\t\t\t\t\t\t " + v + "\t\t\t\t\t\t\t\t\t  " + v);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);

	}

	public static String imprimirDialogoVacio() {
		String v = "\u258A";
		return v + "\t          \t\t\t\t\t\t\u21b5 Intro\t " + v + "\t\t\t\t\t\t\t\t  " + v + "\n" + v
				+ "\t          \t\t\t\t\t\t\t " + v + "\t\t\t\t\t\t\t\t  " + v;
	}

	public static String imprimirPotterMuerte() {
		String v = "\u258A";
		return v + "\tHas muerto.\t\t\t\t\t\t\u21b5 Intro\t " + v + "\t\t\t\t\t\t\t\t  " + v + "\n" + v
				+ "\t          \t\t\t\t\t\t\t " + v + "\t\t\t\t\t\t\t\t  " + v;
	}
}
