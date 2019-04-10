package datos;

import model.Adivinanza;
import model.Enemigo;
import model.Hechizo;
import model.Mision;
import model.Mochila;
import model.Monstruo;
import model.ObjetoMag;
import model.PerPpal;
import model.Pocion;
import model.Respuesta;
import model.Varita;

public class BaseDatos {

	/*
	 * Este seria el mapa que se utiliza en el juego y se trata de un mapa hecho con
	 * un array bidimiensional donde estan pintadas tanto parades, espacios en
	 * blanco donde se podra mover el usuario y espacios a null que no son
	 * interactivos
	 */
	String mapa[][] = {
			/* 0 */ { "\t\t\t@@@@@@@@", null, "@@@@@@@\t\t\t", null, null, null, "   @@@@@@@", null, "@@@@@@@@", null,
					null, null, "\t\t     @@@@@@", null, "@@@@@@@@" },
			/* 1 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 2 */ { "\n\t\t\t@@@@\t", "HP", "\t    ", "  ", "\t    ", "  ", "\t\t  ", "  ", "\t\t", "  ", "\t", "  ",
					"\t  ", "  ", "   @@@@", },
			/* 3 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 4 */ { "\n\t\t\t@@@@@@@@", null, "@@@@@@@\t\t\t", null, null, null, "   @@@@@)", null, "    (@@@@", null,
					null, null, "\t\t     @@@)", null, "    (@@@@@" },
			/* 5 */ { null, null, null, null, null, null,
					"\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t\t\t\t\t\t| ", "  ", " |", null,
					null, null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" },
			/* 6 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 7 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 8 */ { null, null, null, null, null, null,
					"\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t\t\t\t\t\t| ", "  ", " |", null,
					null, null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" },
			/* 9 */ { "\n\t\t\t@@@@@@", null, "@@@@@@@@@\t\t\t", null, null, null, "\t|", null, "    |", null, null,
					null, "\t\t\t     @@@)", null, "    (@@@@@" },
			/* 10 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "///////)", null,
					"    (//////", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 11 */ { "\n\t\t\t@@@@\t", "  ", "\t    ", "  ", "\t    ", "  ", "\t\t  ", "  ", "\t\t", "  ", "\t", "  ",
					"\t  ", "  ", "   @@@@", },
			/* 12 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "///////)", null,
					"    (//////", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 13 */ { "\n\t\t\t@@@@@)", null, "    (@@@@\t\t\t", null, null, null, "\t|", null, "    |", null, null,
					null, "\t\t\t     @@@@", null, "@@@@@@@@@@" },
			/* 14 */ { "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t     | ", "  ", " |", null, null,
					null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |", null, null,
					null, null, null, null },
			/* 15 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 16 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 17 */ { "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t     | ", "  ", " |", null, null,
					null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |", null, null,
					null, null, null, null },
			/* 18 */ { "\n\t\t\t@@@@@)", null, "    (@@@@", null, null, null, "\t\t\t   @@@@@)", null, "    (@@@@",
					null, null, null, "\t\t     @@@@@@", null, "@@@@@@@@" },
			/* 19 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 20 */ { "\n\t\t\t@@@@\t", "  ", "\t    ", "  ", "\t    ", "  ", "\t\t  ", "  ", "\t\t", "  ", "\t", "  ",
					"\t  ", "  ", "   @@@@", },
			/* 21 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 22 */ { "\n\t\t\t@@@@@@@@", null, "@@@@@@@\t\t\t", null, null, null, "   @@@@@@@", null, "@@@@@@@@",
					null, null, null, "\t\t     @@@@@@", null, "@@@@@@@@\n" }, };

	/**
	 * Modificacion del mapa anterios para que salgan los nombres de las salas.
	 */
	String mapaDirecciones[][] = {
			/* 0 */ { "\t\t\t@@@@@@@@", null, "@@@@@@@\t\t\t", null, null, null, "   @@@@@@@", null, "@@@@@@@@", null,
					null, null, "\t\t     @@@@@@", null, "@@@@@@@@" },
			/* 1 */ { "\n\t\t\t@@@@", "   Sala", "  @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", " Sección", "@@@@" },
			/* 2 */ { "\n\t\t\t@@@@", " Gryffindor", "\t   ", "  ", "\t    ", "  ", "\t      ", "Biblioteca", "\t\t",
					null, null, null, "      ", "Prohibida", "@@@@", },
			/* 3 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 4 */ { "\n\t\t\t@@@@@@@@", null, "@@@@@@@\t\t\t", null, null, null, "   @@@@@)", null, "    (@@@@", null,
					null, null, "\t\t     @@@)", null, "    (@@@@@" },
			/* 5 */ { null, null, null, null, null, null,
					"\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t\t\t\t\t\t| ", "  ", " |", null,
					null, null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" },
			/* 6 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 7 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 8 */ { null, null, null, null, null, null,
					"\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t\t\t\t\t\t| ", "  ", " |", null,
					null, null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t\t\t\t\t\t|   " + " |" + "\t\t\t\t|   " + " |" },
			/* 9 */ { "\n\t\t\t@@@@@@", null, "@@@@@@@@@\t\t\t", null, null, null, "\t|", null, "    |", null, null,
					null, "\t\t\t     @@@)", null, "    (@@@@@" },
			/* 10 */ { "\n\t\t\t@@@@", "  Gran ", "  @@@@", "////////", null, "////////", "///////)", null,
					"    (//////", "///////", null, "////////", "@@@@", "  Baño", "  @@@@" },
			/* 11 */ { "\n\t\t\t@@@@", " Comedor", "\t    ", "  ", "\t    ", "  ", "\t\t  ", "  ", "\t\t", "  ", "\t",
					"  ", "      ", "de las", " @@@@", },
			/* 12 */ { "\n\t\t\t@@@@", null, "\t     @@@@", "////////", null, "////////", "///////)", null,
					"    (//////", "///////", null, "////////", "@@@@", " chicas ", "@@@@" },
			/* 13 */ { "\n\t\t\t@@@@@)", null, "    (@@@@\t\t\t", null, null, null, "\t|", null, "    |", null, null,
					null, "\t\t\t     @@@@", null, "@@@@@@@@@@" },
			/* 14 */ { "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t     | ", "  ", " |", null, null,
					null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |", null, null,
					null, null, null, null },
			/* 15 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 16 */ { null, null, null, null, null, null, null, null, null, null, null, null, null, null, null },
			/* 17 */ { "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |" + "\n\t\t\t     | ", "  ", " |", null, null,
					null, "\t\t\t\t| ", "  ", " |" + "\n\t\t\t     |   " + " |" + "\t\t\t\t|   " + " |", null, null,
					null, null, null, null },
			/* 18 */ { "\n\t\t\t@@@@@)", null, "    (@@@@", null, null, null, "\t\t\t   @@@@@)", null, "    (@@@@",
					null, null, null, "\t\t     @@@@@@", null, "@@@@@@@@" },
			/* 19 */ { "\n\t\t\t@@@@", "  Torre", "  @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 20 */ { "\n\t\t\t@@@@", "   del", "\t", "  ", "\t    ", "  ", "\t\t  ", "  ", "\t\t", "  ", "\t", "  ",
					"\t  ", " ", "    @@@@", },
			/* 21 */ { "\n\t\t\t@@@@", "  Reloj ", " @@@@", "////////", null, "////////", "@@@@", null,
					"           @@@@", "///////", null, "////////", "@@@@", null, "        @@@@" },
			/* 22 */ { "\n\t\t\t@@@@@@@@", null, "@@@@@@@\t\t\t", null, null, null, "   @@@@@@@", null, "@@@@@@@@",
					null, null, null, "\t\t     @@@@@@", null, "@@@@@@@@\n" }, };

	/**
	 * Respuestas posibles a la adivinanza.
	 */
	Respuesta[] listaRespuestas = { new Respuesta("Voldemort", false), new Respuesta("Harry Potter", true),
			new Respuesta("Dumbledore", false), new Respuesta("Ron Weasly", false) };
	/**
	 * Adivinanza de la primera mision.
	 */
	Adivinanza adiv = new Adivinanza(
			"\u258A\tAlgo fundé,pero no una casa de Hogwarts.\t\t\t \u258A\t\t\t\t\t\t\t\t  \u258A"
					+ "\n\u258A\tAlguien maté, pero no soy un mortífago.\t\t\t\t \u258A\t\t\t\t\t\t\t\t  \u258A",
			listaRespuestas);

	/**
	 * Objetos magicos del juego.
	 */
	private ObjetoMag[] obj = { new ObjetoMag("Varita", false), new ObjetoMag("Diario", false),
			new ObjetoMag("Espada de Gryffindor", false) };

	/**
	 * Lista de todos los hechizos del juego.
	 */
	private Hechizo[] listaHechizos = { new Hechizo("Incendio", 30, true), new Hechizo("Flipendo", 20, true),
			new Hechizo("Desmaius", 10, true), new Hechizo("Sectumsempra", 30, false),
			new Hechizo("Imperius", 0, false), new Hechizo("Crucio", 40, false),
			new Hechizo("Avada Kedavra", 100, false) };

	/**
	 * Arrays que guardan las pociones
	 */
	private Pocion[] listaBeerus = { null, null, null };
	private Pocion[] listaJager = { null, null, null };

	/**
	 * Pociones que se podran recibir en el juego.
	 */
	private Pocion[] pocionesJuego = { new Pocion("Beerus", 0, 20), new Pocion("Beerus", 0, 20),
			new Pocion("Beerus", 0, 20), new Pocion("Jagermeisterus", 0, 50), new Pocion("Jagermeisterus", 0, 50),
			new Pocion("Jagermeisterus", 0, 50) };

	/**
	 * datos de la varita por defecto
	 */
	private Hechizo[] hechizosVarita = { listaHechizos[0], listaHechizos[1], listaHechizos[2] };

	/**
	 * Datos de la varita del enemigo que se rellenaran aleatoriamente
	 */
	private Hechizo[] varitaEnemigo = { null, null, null };

	/**
	 * Datos de todas la misiones
	 */
	Mision[] listaMisiones = { /* 1 */ new Mision(false, true, null, new Monstruo("Peeves", 100000, 15)),
			/* 2 */ new Mision(false, false, null, new Monstruo("Troll", 75, 25)),
			/* 3 */ new Mision(false, false, null, null),

			/* 4 */ new Mision(false, false, new Enemigo("Tom", "Riddle", 150, new Varita()),
					new Monstruo("Cerbero", 150, 30)),
			/* 5 */ new Mision(false, false, new Enemigo("Draco", "Malfoy", 80, new Varita(varitaEnemigo)),
					new Monstruo("Cerbero", 150, 30)),
			/* 6 */ new Mision(false, false,
					new Enemigo("Voldemort", "El Señor Tenebroso", 200, new Varita(hechizosVarita)), null) };

	/**
	 * Datos del personaje principal
	 */
	private PerPpal hp = new PerPpal("Harry", "Potter", "Gryffindor", "HP", 100, 100, 2, 1,
			new Mochila(listaBeerus, listaJager, obj), new Varita(hechizosVarita));

	public BaseDatos() {

	}

	public String[][] getMapa() {
		return mapa;
	}

	public void setMapa(String[][] mapa) {
		this.mapa = mapa;
	}

	public String[][] getMapaDirecciones() {
		return mapaDirecciones;
	}

	public void setMapaDirecciones(String[][] mapaDirecciones) {
		this.mapaDirecciones = mapaDirecciones;
	}

	public Mision[] getListaMisiones() {
		return listaMisiones;
	}

	public void setListaMisiones(Mision[] listaMisiones) {
		this.listaMisiones = listaMisiones;
	}

	public Respuesta[] getListaRespuestas() {
		return listaRespuestas;
	}

	public void setListaRespuestas(Respuesta[] listaRespuestas) {
		this.listaRespuestas = listaRespuestas;
	}

	public Adivinanza getAdiv() {
		return adiv;
	}

	public void setAdiv(Adivinanza adiv) {
		this.adiv = adiv;
	}

	public ObjetoMag[] getObj() {
		return obj;
	}

	public void setObj(ObjetoMag[] obj) {
		this.obj = obj;
	}

	public Hechizo[] getListaHechizos() {
		return listaHechizos;
	}

	public void setListaHechizos(Hechizo[] listaHechizos) {
		this.listaHechizos = listaHechizos;
	}

	public Pocion[] getListaBeerus() {
		return listaBeerus;
	}

	public void setListaBeerus(Pocion[] listaBeerus) {
		this.listaBeerus = listaBeerus;
	}

	public Pocion[] getListaJager() {
		return listaJager;
	}

	public void setListaJager(Pocion[] listaJager) {
		this.listaJager = listaJager;
	}

	public Pocion[] getPocionesJuego() {
		return pocionesJuego;
	}

	public void setPocionesJuego(Pocion[] pocionesJuego) {
		this.pocionesJuego = pocionesJuego;
	}

	public Hechizo[] getHechizosVarita() {
		return hechizosVarita;
	}

	public void setHechizosVarita(Hechizo[] hechizosVarita) {
		this.hechizosVarita = hechizosVarita;
	}

	public PerPpal getHp() {
		return hp;
	}

	public void setHp(PerPpal hp) {
		this.hp = hp;
	}

	public Hechizo[] getVaritaEnemigo() {
		return varitaEnemigo;
	}

	public void setVaritaEnemigo(Hechizo[] varitaEnemigo) {
		this.varitaEnemigo = varitaEnemigo;
	}

}