package main;

import vistas.PrintsMapa;
import vistas.PrintsMochila;
import vistas.vistasMision1;
import vistas.vistasMision2;
import vistas.vistasMision3;
import vistas.vistasMision4;
import vistas.vistasMision5;
import vistas.vistasMision6;
import vistas.Avisos;
import vistas.CuadroMenu;
import vistas.Plantillas;
import vistas.PrintVarita;
import vistas.PrintsAtaque;
import controller.ComprobarOpciones;
import controller.Leer;
import controller.Mover;
import controller.ResetearPartida;
import crud.CrudAdivinanza;
import crud.CrudEnemigo;
import crud.CrudMochila;
import crud.CrudMonstruo;
import crud.CrudPerPpal;
import crud.CrudVarita;
import datos.BaseDatos;
/**
 * 
 * @author Juan Manuel Gracia Pardal
 *
 */
public class Ppal {

	public static void main(String[] args) throws InterruptedException {
	
/**
 * Esta clase es la clase principal en donde se ejecuta la aplicacion.
 */
		String siguiente = " ", intro = "", siguienteError = " ";
		char mov;
		int numRespuesta = 0, auxiliar = 0;
		/* menÃº ppal */ String menu, menuMapaDirecciones, menuMochila, menuVarita;
		/* menÃº varita */ int numElegido1 = 0, numElegido2 = 0;
		/* misiÃ³n 1 */ int numMision1 = 0, habitacion1X = 20, habitacion1Y = 1, numOpciones = 4;
		/* misiÃ³n 2 */ String menuM2;
		int m2Superada = 0, numMision2 = 1, habitacion2X = 11, habitacion2Y = 13, /* misiÃ³n 3 */ m3Superada = 0,
				habitacion3X = 11, habitacion3Y = 1, habitacion4X = 20, habitacion4Y = 13, numDiario = 1, numEspada = 2,
				/* misiÃ³n 4 */ m4Superada = 0, habitacion5X = 2, habitacion5Y = 7, habitacion6X = 2, habitacion6Y = 13;
		String menuM4, opcion;
		/* misiÃ³n 5 */ int m5Superada = 0, numMision5 = 4, /* misiÃ³n 6 */ m6Superada = 0, habitacion7X = 20,
				habitacion7Y = 7;
		/* OpciÃ³n atacar */ int opcionAtaque = 0;
		/* Num Hechizos */ int sectumsempra = 3, imperio = 4, crucio = 5, avada = 6;
		/* Num Objetos */ int varita = 0;
		/* bondad */ int bondad1 = 25, bondad3 = 35, limiteBondad = 50;
		/* Menu mochila */ String menuM1;
		BaseDatos bd = new BaseDatos();

		do { // dowhile del juego entero
			do {
				Plantillas.imprimirInicio();
				menu = Leer.dato();
			} while (!menu.equals("1") && !menu.equals("0")); // 1 EMPEZAR, 0 SALIR.
			switch (menu) {
			case "1":
				

				/* MISION 1 */
				do { // dowhile repetir mision 1.
					do {// repetir mapa hasta lanzar mision
						PrintsMapa.imprimirMapa(bd.getMapa());
						CuadroMenu.cuadroM1();
						mov = Leer.datoChar();

						switch (mov) {
						case '1': // Mapa merodeador
							do {
								PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
								CuadroMenu.cuadroMapaDirecciones();
								menuMapaDirecciones = Leer.dato();
							} while (!menuMapaDirecciones.equals("0"));
							break;
						case '2':
							do {
								PrintsMochila.imprimirMochila(bd.getHp());
								menuMochila = Leer.dato();
								switch (menuMochila) {
								case "1":// VER VARITA
									do {
										PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
										PrintVarita.imprimirVaritaOpciones();
										menuVarita = Leer.dato();
										switch (menuVarita) {
										case "1":// CAMBIAR HECHIZO

											do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

												PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
												numElegido1 = Leer.datoInt();

												if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
													bd.getHp().getV().getH1()) != true);

											do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS DEL
												// JUEGO

												PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
														bd.getListaHechizos());
												numElegido2 = Leer.datoInt();
												if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
													bd.getListaHechizos()) != true);

											CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2, bd.getHp().getV(),
													bd.getListaHechizos());

											break;

										case "0":// SALIR DE VARITA
											break;
										default:
											do {// ERROR AL PULSAR TECLA EN MENU VARITA
												PrintVarita.imprimirPlantillaVarita(bd.getHp(),
														bd.getHp().getV().getH1());
												PrintVarita.imprimirError();
												siguiente = Leer.dato();
											} while (!siguiente.equals(intro));
											break;
										}
									} while (!menuVarita.equals("0")); // REPITE MENÃš DE VARITA MIENTRAS SEA DIFERENTE
																		// DE 0
									break;
								case "2":// tomar beerus DE MOCHILA
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());// QUÃ‰
																												// POSICIÃ“N
																												// DEL
																												// ARRAY
																												// TIENE
																												// UNA
																												// POCIÃ“N
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
											auxiliar);// TOMAR POCIÃ“N Y PONER NULL DONDE ESTABA GUARDADO
									break;

								case "3":// tomar jager
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
											auxiliar);
									break;
								}
							} while (!menuMochila.equals("0"));// repite mochila mientras sea diferente de 0
							break;
						case '0':// salir de juego mirar si se puede arreglar.
							break;

						}
						Mover.Moverse(mov, bd.getMapa(), bd.getHp());
					} while (!bd.getMapa()[habitacion1X][habitacion1Y].equals(bd.getHp().getIniciales()));// FIN DO
																											// WHILE
																											// PARA
																											// REPETIR
																											// MAPA
					// REPITE MAPA MIENTRAS EN LA POSICION DE ESAS VARIABLES NO PONGA "HP"
					/* DESPLIEGUE M1 */
					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
								vistasMision1.imprimirDialogo1M1(), bd.getHp());
						siguiente = Leer.dato();
						if (!siguiente.equals(intro)) {
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguienteError = Leer.dato();
							} while (!siguienteError.equals(intro));
						}
					} while (!siguiente.equals(intro));
					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
								vistasMision1.imprimirDialogo2M1(), bd.getHp());
						siguiente = Leer.dato();
						if (!siguiente.equals(intro)) {
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguienteError = Leer.dato();
							} while (!siguienteError.equals(intro));
						}
					} while (!siguiente.equals(intro));

					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
								vistasMision1.imprimirOpcionesM1(), bd.getHp());
						menuM1 = Leer.dato();
						switch (menuM1) {
						case "1":
							CrudPerPpal.modificarBondad(bd.getHp(), -bondad1);
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFilch(),
										vistasMision1.imprimirDialogoPutFilch(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFilch(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
										vistasMision1.pasarMision1(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							break;

						case "2":
							do {

								CrudPerPpal.modificarBondad(bd.getHp(), bondad1);
								Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
										vistasMision1.imprmirAdivinanza(bd.getAdiv()), bd.getHp());
								numRespuesta = Leer.datoInt();

								if (CrudAdivinanza.comprobarRespuesta(bd.getAdiv(), numRespuesta) != true
										|| numRespuesta > numOpciones) {
									CrudPerPpal.quitarVidaPjMons(bd.getListaMisiones()[numMision1].getM(), bd.getHp());
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
												vistasMision1.acertarAdivinanza(numRespuesta, bd.getAdiv(),
														bd.getListaMisiones()[0]),
												bd.getHp());
										siguiente = Leer.dato();
										if (!siguiente.equals(intro)) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (!siguiente.equals(intro));
								} else {// SI HA ACERTADO LA ADIVINANZA:
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
												vistasMision1.acertarAdivinanza(numRespuesta, bd.getAdiv(),
														bd.getListaMisiones()[0]),
												bd.getHp());
										siguiente = Leer.dato();
										if (!siguiente.equals(intro)) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (!siguiente.equals(intro));
								}

							} while (CrudAdivinanza.comprobarRespuesta(bd.getAdiv(), numRespuesta) != true);
							break;
						default:
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision1.imprimirFantasma(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguiente = Leer.dato();
							} while (!siguiente.equals(intro));
							break;
						}
						CrudMochila.cargarPocion(bd.getHp().getMochila1(), bd.getPocionesJuego());
						bd.getHp().getMochila1().getListaObjetos()[varita].setEncontrado(true);// tiene varita.

					} while (!menuM1.equals("2") && !menuM1.equals("1"));

				} while (bd.getHp().getVida() == 0); // repite la misiÃ³n mientras la vida sea 0 que es muerte.

				/* MISION 2 */
				do {// primer do while mision 2
					do {// repetir mapa hasta lanzar mision
						PrintsMapa.imprimirMapa(bd.getMapa());
						CuadroMenu.cuadroM2();
						mov = Leer.datoChar();

						switch (mov) {
						case '1':
							do {
								PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
								CuadroMenu.cuadroMapaDirecciones();
								menuMapaDirecciones = Leer.dato();
							} while (!menuMapaDirecciones.equals("0"));
							break;
						case '2':
							do {
								PrintsMochila.imprimirMochila(bd.getHp());
								menuMochila = Leer.dato();
								switch (menuMochila) {
								case "1":
									do {
										PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
										PrintVarita.imprimirVaritaOpciones();
										menuVarita = Leer.dato();
										switch (menuVarita) {
										case "1":

											do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

												PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
												numElegido1 = Leer.datoInt();

												if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
													bd.getHp().getV().getH1()) != true);

											do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS DEL
												// JUEGO

												PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
														bd.getListaHechizos());
												numElegido2 = Leer.datoInt();
												if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
													bd.getListaHechizos()) != true);

											CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2, bd.getHp().getV(),
													bd.getListaHechizos());

											break;

										case "0":
											break;
										default:
											do {
												PrintVarita.imprimirPlantillaVarita(bd.getHp(),
														bd.getHp().getV().getH1());
												PrintVarita.imprimirError();
												siguiente = Leer.dato();
											} while (!siguiente.equals(intro));
											break;
										}
									} while (!menuVarita.equals("0"));
									break;
								case "2":// tomar beerus
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
											auxiliar);
									break;

								case "3":// tomar jager
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
											auxiliar);
									break;

								}
							} while (!menuMochila.equals("0"));
							break;
						case '0':
							break;

						}
						Mover.Moverse(mov, bd.getMapa(), bd.getHp());
					} while (!bd.getMapa()[habitacion2X][habitacion2Y].equals(bd.getHp().getIniciales()));
					/* DESPLIEGUE M2 */
					auxiliar = bd.getHp().getVida();// GUARDO VIDA POR SI MUERE HP

					do {// while para repetir toda la misiÃ³n si muere HP
						bd.getHp().setVida(auxiliar);
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollCon(),
									vistasMision2.imprimirDialogo2M2(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollCon(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));

						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollCon(),
									vistasMision2.imprimirDialogo3M2(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollCon(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));

						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollCon(),
									vistasMision2.imprimirOpcionesM2(), bd.getHp());
							menuM2 = Leer.dato();
							switch (menuM2) {
							case "1":// salvar goyle y juguete
								CrudPerPpal.modificarBondad(bd.getHp(), bondad1);
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollMoni(),
											vistasMision2.imprimirDialogo4M2GoyleSalvado(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollMoni(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}

								} while (!siguiente.equals(intro));
								CrudMochila.cargarPocion(bd.getHp().getMochila1(), bd.getPocionesJuego());// cargo
																											// pociÃ³n
								bd.getListaHechizos()[sectumsempra].setAprendido(true);// cargo hechizo nuevo.
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollMoni(),
											vistasMision2.imprimirFinBondad(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTrollMoni(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));

								break;
							case "2":
								CrudPerPpal.modificarBondad(bd.getHp(), -bondad3);
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
											vistasMision2.imprimirDialogo4M2GoyleDevorado(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}

								} while (!siguiente.equals(intro));
								do {
									do {// do while para imprimir las opciones de ataque (hechizos)
										PrintsAtaque.imprimirAtaque(vistasMision2.imprimirTroll(), bd.getHp(),
												bd.getListaMisiones()[numMision2].getM().getVida());
										opcionAtaque = Leer.datoInt();
										if (opcionAtaque > 3 || opcionAtaque < 1) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (opcionAtaque > 3 || opcionAtaque < 1);
									// quito vida a monstruo y a hp
									CrudMonstruo.quitarVidaMons(bd.getListaMisiones()[numMision2].getM(),
											bd.getHp().getV().getH1()[opcionAtaque - 1]);
									CrudPerPpal.quitarVidaPjMons(bd.getListaMisiones()[numMision2].getM(), bd.getHp());
									// syso de que el monstruo ha atacado.
									do {
										PrintsAtaque.imprimirAtaqueMons(vistasMision2.imprimirTroll(), bd.getHp(),
												bd.getListaMisiones()[numMision2].getM());
										siguiente = Leer.dato();
										if (!siguiente.equals(intro)) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (!siguiente.equals(intro));

									// REPITE ATAQUE MIENTRAS LA VIDA DEL MONSTRUO Y DE HARRY SEA MAYOR O IGUAL A 1,
									// en el momento en el que no se cumpla una condiciÃ³n, sale.
								} while (bd.getListaMisiones()[numMision2].getM().getVida() >= 1
										&& bd.getHp().getVida() >= 1);

								if (bd.getHp().getVida() > 0) {// has derrotado al monstruo. sigues vivo, enhorabuena.
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
												vistasMision2.imprimirFinMaldad(), bd.getHp());
										siguiente = Leer.dato();
										if (!siguiente.equals(intro)) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (!siguiente.equals(intro));
									CrudMochila.cargarPocion(bd.getHp().getMochila1(), bd.getPocionesJuego());
									bd.getListaHechizos()[sectumsempra].setAprendido(true);

								}
								if (bd.getHp().getVida() == 0) {
									do {// aviso de que HP ha muerto
										Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
												Plantillas.imprimirPotterMuerte(), bd.getHp());
										siguiente = Leer.dato();
										if (!siguiente.equals(intro)) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (!siguiente.equals(intro));
								}
								break;
							default:
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision2.imprimirTroll(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguiente = Leer.dato();

								} while (!siguiente.equals(intro));
								break;
							}
						} while (!menuM2.equals("1") && !menuM2.equals("2"));
					} while (bd.getHp().getVida() == 0);
					if (bd.getHp().getVida() > 0) {
						m2Superada++;
					}

				} while (m2Superada == 0);
				/* MISIÃ“N 3 */
				do {// primer do while mision 3
					do {// repetir mapa hasta lanzar mision
						PrintsMapa.imprimirMapa(bd.getMapa());
						CuadroMenu.cuadroM3n1();
						mov = Leer.datoChar();

						switch (mov) {
						case '1':
							do {
								PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
								CuadroMenu.cuadroMapaDirecciones();
								menuMapaDirecciones = Leer.dato();
							} while (!menuMapaDirecciones.equals("0"));
							break;
						case '2':
							do {
								PrintsMochila.imprimirMochila(bd.getHp());
								menuMochila = Leer.dato();
								switch (menuMochila) {
								case "1":
									do {
										PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
										PrintVarita.imprimirVaritaOpciones();
										menuVarita = Leer.dato();
										switch (menuVarita) {
										case "1":

											do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

												PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
												numElegido1 = Leer.datoInt();

												if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
													bd.getHp().getV().getH1()) != true);

											do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS DEL
												// JUEGO

												PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
														bd.getListaHechizos());
												numElegido2 = Leer.datoInt();
												if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
													bd.getListaHechizos()) != true);

											CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2, bd.getHp().getV(),
													bd.getListaHechizos());

											break;

										case "0":
											break;
										default:
											do {
												PrintVarita.imprimirPlantillaVarita(bd.getHp(),
														bd.getHp().getV().getH1());
												PrintVarita.imprimirError();
												siguiente = Leer.dato();
											} while (!siguiente.equals(intro));
											break;
										}
									} while (!menuVarita.equals("0"));
									break;
								case "2":// tomar beerus
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
											auxiliar);
									break;

								case "3":// tomar jager
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
											auxiliar);
									break;

								}
							} while (!menuMochila.equals("0"));
							break;
						case '0':
							break;

						}
						Mover.Moverse(mov, bd.getMapa(), bd.getHp());
					} while (!bd.getMapa()[habitacion3X][habitacion3Y].equals(bd.getHp().getIniciales()));// cambiar
																											// habitacion

//DESPLIEGUE DE MISIÃ“N 3

					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirMyrtle(),
								vistasMision3.imprimirDialogoMyrtle2M3(), bd.getHp());
						siguiente = Leer.dato();
						if (!siguiente.equals(intro)) {
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirMyrtle(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguienteError = Leer.dato();
							} while (!siguienteError.equals(intro));
						}
					} while (!siguiente.equals(intro));
					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirMyrtle(),
								vistasMision3.imprimirDialogoMyrtle3M3(), bd.getHp());
						siguiente = Leer.dato();
						if (!siguiente.equals(intro)) {
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirMyrtle(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguienteError = Leer.dato();
							} while (!siguienteError.equals(intro));
						}
					} while (!siguiente.equals(intro));
					// BUSCAR MENESTERES
					do {// repetir mapa hasta lanzar mision
						PrintsMapa.imprimirMapa(bd.getMapa());
						CuadroMenu.cuadroM3n2();
						mov = Leer.datoChar();

						switch (mov) {
						case '1':
							do {
								PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
								CuadroMenu.cuadroMapaDirecciones();
								menuMapaDirecciones = Leer.dato();
							} while (!menuMapaDirecciones.equals("0"));
							break;
						case '2':
							do {
								PrintsMochila.imprimirMochila(bd.getHp());
								menuMochila = Leer.dato();
								switch (menuMochila) {
								case "1":
									do {
										PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
										PrintVarita.imprimirVaritaOpciones();
										menuVarita = Leer.dato();
										switch (menuVarita) {
										case "1":

											do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

												PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
												numElegido1 = Leer.datoInt();

												if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
													bd.getHp().getV().getH1()) != true);

											do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS DEL
												// JUEGO

												PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
														bd.getListaHechizos());
												numElegido2 = Leer.datoInt();
												if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
													bd.getListaHechizos()) != true);

											CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2, bd.getHp().getV(),
													bd.getListaHechizos());

											break;

										case "0":
											break;
										default:
											do {
												PrintVarita.imprimirPlantillaVarita(bd.getHp(),
														bd.getHp().getV().getH1());
												PrintVarita.imprimirError();
												siguiente = Leer.dato();
											} while (!siguiente.equals(intro));
											break;
										}
									} while (!menuVarita.equals("0"));
									break;
								case "2":// tomar beerus
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
											auxiliar);
									break;

								case "3":// tomar jager
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
											auxiliar);
									break;

								}
							} while (!menuMochila.equals("0"));
							break;
						case '0':
							break;

						}
						Mover.Moverse(mov, bd.getMapa(), bd.getHp());
					} while (!bd.getMapa()[habitacion4X][habitacion4Y].equals(bd.getHp().getIniciales()));// cambiar
																											// habitacion
					// Despliegue menesteres

					if (bd.getHp().getBondad() >= limiteBondad) {// ESPADA
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirEspada(),
									vistasMision3.encontrarEspada(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirEspada(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}

						} while (!siguiente.equals(intro));
						bd.getHp().getMochila1().getListaObjetos()[numEspada].setEncontrado(true);
					} else if (bd.getHp().getBondad() < limiteBondad) {// DIARIO

						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirDiario(),
									vistasMision3.encontrarDiario(), bd.getHp());

							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision3.imprimirDiario(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						bd.getHp().getMochila1().getListaObjetos()[numDiario].setEncontrado(true);

					}
					m3Superada++;
				} while (m3Superada == 0);
				/* MISION 4 */

				do {// primer do while mision 4
					if (bd.getObj()[numDiario].isEncontrado() == true) {
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirLibro1(),
									Plantillas.imprimirDialogoVacio(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirLibro1(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						do {// repetir mapa hasta lanzar mision
							PrintsMapa.imprimirMapa(bd.getMapa());
							CuadroMenu.cuadroM4n1();
							mov = Leer.datoChar();

							switch (mov) {
							case '1':
								do {
									PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
									CuadroMenu.cuadroMapaDirecciones();
									menuMapaDirecciones = Leer.dato();
								} while (!menuMapaDirecciones.equals("0"));
								break;
							case '2':
								do {
									PrintsMochila.imprimirMochila(bd.getHp());
									menuMochila = Leer.dato();
									switch (menuMochila) {
									case "1":
										do {
											PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
											PrintVarita.imprimirVaritaOpciones();
											menuVarita = Leer.dato();
											switch (menuVarita) {
											case "1":

												do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

													PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
													numElegido1 = Leer.datoInt();

													if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
															bd.getHp().getV().getH1()) != true) {
														PrintVarita.imprimirPlantillaVarita(bd.getHp(),
																bd.getListaHechizos());
														PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
													}

												} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true);

												do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS
													// DEL JUEGO

													PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
															bd.getListaHechizos());
													numElegido2 = Leer.datoInt();
													if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
															bd.getListaHechizos()) != true) {
														PrintVarita.imprimirPlantillaVarita(bd.getHp(),
																bd.getListaHechizos());
														PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
													}

												} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true);

												CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2,
														bd.getHp().getV(), bd.getListaHechizos());

												break;

											case "0":
												break;
											default:
												do {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getHp().getV().getH1());
													PrintVarita.imprimirError();
													siguiente = Leer.dato();
												} while (!siguiente.equals(intro));
												break;
											}
										} while (!menuVarita.equals("0"));
										break;
									case "2":// tomar beerus
										auxiliar = CrudMochila
												.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());
										CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
												auxiliar);
										break;

									case "3":// tomar jager
										auxiliar = CrudMochila
												.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
										CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
												auxiliar);
										break;

									}
								} while (!menuMochila.equals("0"));
								break;
							case '0':
								break;

							}
							Mover.Moverse(mov, bd.getMapa(), bd.getHp());
						} while (!bd.getMapa()[habitacion5X][habitacion5Y].equals(bd.getHp().getIniciales()));// cambiarhabitacion
						// despliegue maldad

						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirLibro2(),
									vistasMision4.imprimirDialogoDiario1M4(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirLibro2(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						bd.getListaHechizos()[imperio].setAprendido(true);
						bd.getListaHechizos()[crucio].setAprendido(true);
						bd.getListaHechizos()[avada].setAprendido(true);
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
									vistasMision4.imprimirDialogoDiario2M4(), bd.getHp());
							opcion = Leer.dato();

							switch (opcion) {
							case "1":
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
											vistasMision4.imprimirDialogoCrucioM4(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));
								CrudPerPpal.modificarBondad(bd.getHp(), -bondad3);
								break;
							case "2":
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
											vistasMision4.imprimirDialogoImperioM4(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));
								CrudPerPpal.modificarBondad(bd.getHp(), -bondad1);

								break;
							case "3":
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
											vistasMision4.imprimirDialogoAccionBuenaM4(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));
								CrudPerPpal.modificarBondad(bd.getHp(), bondad3);

								break;
							default:
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCaraSusto(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguiente = Leer.dato();
								} while (!siguiente.equals(intro));
								break;
							}
						} while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3"));

					}
					// tanto si es bueno o malo se despliega la siguiente parte:
					do {// repetir mapa hasta lanzar mision
						PrintsMapa.imprimirMapa(bd.getMapa());
						CuadroMenu.cuadroM4n2();
						mov = Leer.datoChar();

						switch (mov) {
						case '1':
							do {
								PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
								CuadroMenu.cuadroMapaDirecciones();
								menuMapaDirecciones = Leer.dato();
							} while (!menuMapaDirecciones.equals("0"));

							break;
						case '2':
							do {
								PrintsMochila.imprimirMochila(bd.getHp());
								menuMochila = Leer.dato();
								switch (menuMochila) {
								case "1":
									do {
										PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
										PrintVarita.imprimirVaritaOpciones();
										menuVarita = Leer.dato();
										switch (menuVarita) {
										case "1":

											do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

												PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
												numElegido1 = Leer.datoInt();

												if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
													bd.getHp().getV().getH1()) != true);

											do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS DEL
												// JUEGO

												PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
														bd.getListaHechizos());
												numElegido2 = Leer.datoInt();
												if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
													bd.getListaHechizos()) != true);

											CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2, bd.getHp().getV(),
													bd.getListaHechizos());

											break;

										case "0":
											break;
										default:
											do {
												PrintVarita.imprimirPlantillaVarita(bd.getHp(),
														bd.getHp().getV().getH1());
												PrintVarita.imprimirError();
												siguiente = Leer.dato();
											} while (!siguiente.equals(intro));
											break;
										}
									} while (!menuVarita.equals("0"));
									break;
								case "2":// tomar beerus
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
											auxiliar);
									break;

								case "3":// tomar jager
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
											auxiliar);
									break;

								}
							} while (!menuMochila.equals("0"));
							break;
						case '0':
							break;

						}
						Mover.Moverse(mov, bd.getMapa(), bd.getHp());
					} while (!bd.getMapa()[habitacion6X][habitacion6Y].equals(bd.getHp().getIniciales()));// cambiarhabitacion

					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
								vistasMision4.imprimirDialogoEspada1M4(), bd.getHp());
						siguiente = Leer.dato();
						if (!siguiente.equals(intro)) {
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguienteError = Leer.dato();
							} while (!siguienteError.equals(intro));
						}
					} while (!siguiente.equals(intro));
					do {
						Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
								vistasMision4.imprimirDialogoEspada2M4(), bd.getHp());
						siguiente = Leer.dato();
						if (!siguiente.equals(intro)) {
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguienteError = Leer.dato();
							} while (!siguienteError.equals(intro));
						}
					} while (!siguiente.equals(intro));

					do {
						if (bd.getHp().getBondad() < limiteBondad) {
							Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
									vistasMision4.imprimirDialogoEspada3M4M(), bd.getHp());

						} else {
							Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
									vistasMision4.imprimirDialogoEspada3M4(), bd.getHp());

						}
						menuM4 = Leer.dato();
						switch (menuM4) {
						case "1":// tocar el arpa
							CrudPerPpal.modificarBondad(bd.getHp(), bondad3);
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
										vistasMision4.imprimirDialogoArpa(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
										if (!siguiente.equals(intro)) {
											do {
												Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
														Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
												siguienteError = Leer.dato();
											} while (!siguienteError.equals(intro));
										}
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							CrudMochila.cargarPocion(bd.getHp().getMochila1(), bd.getPocionesJuego());

							break;
						case "2":// troll
							if (bd.getHp().getBondad() < limiteBondad) {
								CrudPerPpal.modificarBondad(bd.getHp(), -bondad3);
							} else {
								CrudPerPpal.modificarBondad(bd.getHp(), bondad3);

							}
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
										vistasMision4.imprimirDialogoTroll(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							CrudMochila.cargarPocion(bd.getHp().getMochila1(), bd.getPocionesJuego());

							break;
						default:
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision4.imprimirCerbero(),
										Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
								siguiente = Leer.dato();
							} while (!siguiente.equals(intro));
							break;
						}
					} while (!menuM4.equals("1") && !menuM4.equals("2"));
					if (bd.getHp().getBondad() < limiteBondad) {
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirPiedra(),
									vistasMision4.imprimirDialogoPiedraM4(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirPiedra(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
					}

					m4Superada++;

				} while (m4Superada == 0);
				/* MISION 5 */ auxiliar = bd.getHp().getVida();// guardar vida por si muere resetear a cuando empezÃ³ la
																// misiÃ³n.
				if (bd.getHp().getBondad() >= limiteBondad) { // SOLO SI ES LÃ�NEA HÂº BONDAD
					do {// primer do while mision 5
						auxiliar = bd.getHp().getVida();
						do {// si muere
							bd.getHp().setVida(auxiliar);

							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirPiedra(),
										vistasMision5.imprimirDialogo1M5(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirPiedra(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirPiedra(),
										vistasMision5.imprimirDialogo2M5(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirPiedra(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							do {
								Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
										vistasMision5.imprimirDialogo3M5(), bd.getHp());
								siguiente = Leer.dato();
								if (!siguiente.equals(intro)) {
									do {
										Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
												Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
										siguienteError = Leer.dato();
									} while (!siguienteError.equals(intro));
								}
							} while (!siguiente.equals(intro));
							CrudVarita.cargarHechizosEnemigo(bd.getListaMisiones()[numMision5].getE().getV(),
									bd.getListaHechizos());// CARGO ALEATORIAMENTE LA VARITA DEL ENEMIGO

							do {
								do {
									PrintsAtaque.imprimirAtaque(vistasMision5.imprimirDraco(), bd.getHp(),
											bd.getListaMisiones()[numMision5].getE().getVida());
									opcionAtaque = Leer.datoInt();
									if (opcionAtaque > 3 || opcionAtaque < 1) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (opcionAtaque > 3 || opcionAtaque < 1);
								CrudEnemigo.modificarVidaEnemigo(bd.getHp().getV().getH1()[opcionAtaque - 1],
										bd.getListaMisiones()[numMision5].getE());
								CrudPerPpal.quitarVidaPjHechiz(bd.getHp(), bd.getListaMisiones()[numMision5].getE());
								do {
									PrintsAtaque.imprimirAtaqueEnem(vistasMision5.imprimirDraco(), bd.getHp(),
											bd.getListaMisiones()[numMision5].getE());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));

							} while (bd.getListaMisiones()[numMision5].getE().getVida() >= 1
									&& bd.getHp().getVida() >= 1);

							if (bd.getHp().getVida() == 0) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
											Plantillas.imprimirPotterMuerte(), bd.getHp());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));
							}
							if (bd.getHp().getVida() > 0) {
								do {
									PrintsAtaque.imprimirDerrotadoEnem(vistasMision5.imprimirDraco(), bd.getHp(),
											bd.getListaMisiones()[numMision5].getE());
									siguiente = Leer.dato();
									if (!siguiente.equals(intro)) {
										do {
											Plantillas.imprimirPlantillaMisiones(vistasMision5.imprimirDraco(),
													Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
											siguienteError = Leer.dato();
										} while (!siguienteError.equals(intro));
									}
								} while (!siguiente.equals(intro));
							}

						} while (bd.getHp().getVida() == 0);

						m5Superada++;
					} while (m5Superada == 0);
				} // FIN IF BONDAD M5
				/* MISION 6 */
				do {// primer do while mision 6
					do {// repetir mapa hasta lanzar mision
						if (bd.getHp().getBondad() < limiteBondad) {
							PrintsMapa.imprimirMapa(bd.getMapa());
							CuadroMenu.cuadroM6M();
						} else {
							PrintsMapa.imprimirMapa(bd.getMapa());
							CuadroMenu.cuadroM6B();
						}
						mov = Leer.datoChar();

						switch (mov) {
						case '1':
							do {
								PrintsMapa.imprimirMapa(bd.getMapaDirecciones());
								CuadroMenu.cuadroMapaDirecciones();
								menuMapaDirecciones = Leer.dato();
							} while (!menuMapaDirecciones.equals("0"));
							break;
						case '2':
							do {
								PrintsMochila.imprimirMochila(bd.getHp());
								menuMochila = Leer.dato();
								switch (menuMochila) {
								case "1":
									do {
										PrintVarita.imprimirPlantillaVarita(bd.getHp(), bd.getListaHechizos());
										PrintVarita.imprimirVaritaOpciones();
										menuVarita = Leer.dato();
										switch (menuVarita) {
										case "1":

											do { // DO WHILE PARA CAMBIAR HECHIZO DE VARITA

												PrintVarita.cargarVarita(bd.getHp(), bd.getListaHechizos());
												numElegido1 = Leer.datoInt();

												if (ComprobarOpciones.avisarTeclaVarita(numElegido1,
														bd.getHp().getV().getH1()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido1, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido1,
													bd.getHp().getV().getH1()) != true);

											do {// DO WHILE PARA CARGAR UN HECHIZO EN VARITA DE LA LISTA DE HECHIZOS DEL
												// JUEGO

												PrintVarita.elegirHechizo(bd.getHp(), numElegido1,
														bd.getListaHechizos());
												numElegido2 = Leer.datoInt();
												if (ComprobarOpciones.avisarTeclaVarita(numElegido2,
														bd.getListaHechizos()) != true) {
													PrintVarita.imprimirPlantillaVarita(bd.getHp(),
															bd.getListaHechizos());
													PrintVarita.avisarOpcionIncorrecta(numElegido2, bd.getHp());
												}

											} while (ComprobarOpciones.avisarTeclaVarita(numElegido2,
													bd.getListaHechizos()) != true);

											CrudVarita.cargarHechizoTeclado(numElegido1, numElegido2, bd.getHp().getV(),
													bd.getListaHechizos());

											break;

										case "0":
											break;
										default:
											do {
												PrintVarita.imprimirPlantillaVarita(bd.getHp(),
														bd.getHp().getV().getH1());
												PrintVarita.imprimirError();
												siguiente = Leer.dato();
											} while (!siguiente.equals(intro));
											break;
										}
									} while (!menuVarita.equals("0"));
									break;
								case "2":// tomar beerus
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaBeerus());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaBeerus(),
											auxiliar);
									break;

								case "3":// tomar jager
									auxiliar = CrudMochila
											.comprobarLlenoMochila(bd.getHp().getMochila1().getListaJager());
									CrudMochila.tomarPocion(bd.getHp(), bd.getHp().getMochila1().getListaJager(),
											auxiliar);
									break;

								}
							} while (!menuMochila.equals("0"));
							break;
						case '0':
							break;

						}
						Mover.Moverse(mov, bd.getMapa(), bd.getHp());
					} while (!bd.getMapa()[habitacion7X][habitacion7Y].equals(bd.getHp().getIniciales()));// cambiar
																											// habitacion
					// despliegue

					if (bd.getHp().getMochila1().getListaObjetos()[numEspada].isEncontrado() == true) { // si eres buena
																										// persona...
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
									vistasMision6.imprimirDialogoDumbeldore(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
									vistasMision6.imprimirDialogo1Bondad(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));

						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
									vistasMision6.imprimirDialogo2M6(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirDiarioEspada(),
									vistasMision6.imprimirDialogo3M6(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirDiarioEspada(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
					}

					if (bd.getHp().getMochila1().getListaObjetos()[numDiario].isEncontrado() == true) { // si eres malo

						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
									vistasMision6.imprimirDialogo1Maldad(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemortBlur(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemort8(),
									vistasMision6.imprimirDialogo3Maldad(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemort8(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));
						do {
							Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemort8(),
									vistasMision6.imprimirDialogo1M6(), bd.getHp());
							siguiente = Leer.dato();
							if (!siguiente.equals(intro)) {
								do {
									Plantillas.imprimirPlantillaMisiones(vistasMision6.imprimirVoldemort8(),
											Avisos.avisarMisionTeclaIncorrecta(), bd.getHp());
									siguienteError = Leer.dato();
								} while (!siguienteError.equals(intro));
							}
						} while (!siguiente.equals(intro));

					}
					m6Superada++;

				} while (m6Superada == 0);

				do {
					Plantillas.imprimirFin();
					siguiente = Leer.dato();
				} while (!siguiente.equals(intro));

				Plantillas.imprimirCreditos();

				break;
			case "0":// SALIR
				break;

			}
			ResetearPartida.reiniciar(bd.getHp(), bd.getListaHechizos(), bd.getObj(), bd.getPocionesJuego(),
					bd.getVaritaEnemigo(), bd.getListaMisiones(), bd.getMapa());
		} while (menu.equals("1"));// dowhile del juego entero, REPITE MIENTRAS HAYA EMPEZADO EL JUEGO.

	}

}
