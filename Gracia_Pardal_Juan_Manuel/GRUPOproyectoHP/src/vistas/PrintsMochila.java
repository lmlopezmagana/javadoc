package vistas;

import crud.CrudMochila;
import model.PerPpal;

public class PrintsMochila {

	public static void imprimirMochila(PerPpal hp) {
		String h = "\u2586";
		String v = "\u258A";
		int numVarita = 0, numDiario = 1, numEspada = 2, filas = 10;
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(
				v + "\t\t\t\t\t\t\t\t\t\t\t\t\tVida ♥ " + hp.getVida() + "\t Bondad " + hp.getBondad() + "\t" + v);
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);
		System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
		System.out.println(v + "\t\t\t\t\t\t\t\tOBJETOS MAGICOS\t\t\t\t\t\t\t\t" + v);
		if (hp.getMochila1().getListaObjetos()[numDiario].isEncontrado() == true
				&& hp.getMochila1().getListaObjetos()[numVarita].isEncontrado() == true) {
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.print(
					"\u258A\t          \u2588\u2588\t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t         \u2588\u2588 \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t        \u2588\u2588  \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t       \u2588\u2588   \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t      \u2588\u2588    \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t     \u2588\u2588     \t\t  \u2588\u2588 TOM RIDDLE \u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t    \u2588\u2588      \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t   \u2588\u2588       \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t  \u2593\u2593        \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t \u2588\u2588         \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t\u2593\u2593          \t\t  \u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\u258A"
							+ "\n\u258A\t    VARITA\t\tDIARIO DE TOM RIDDLE\t\t\t\t\t\t\t\t\t\t\t\u258A\n");

			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
		} else if (hp.getMochila1().getListaObjetos()[numEspada].isEncontrado() == true
				&& hp.getMochila1().getListaObjetos()[numVarita].isEncontrado() == true) {
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.print("\u258A\t          \u2588\u2588\t\t         \u2588            \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t         \u2588\u2588 \t\t         \u2588            \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t        \u2588\u2588  \t\t       \u2588\u2588\u2588\u2588\u2588      \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t       \u2588\u2588   \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t      \u2588\u2588    \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t     \u2588\u2588     \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t    \u2588\u2588      \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t   \u2588\u2588       \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t  \u2593\u2593        \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t \u2588\u2588         \t\t        \u2591\u2591\u2591           \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t\u2593\u2593          \t\t         \u2591             \t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t    VARITA\t\tESPADA DE GRYFFINDOR\t\t\t\t\t\t\t\t\t\t\t\u258A\n");
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
		} else if (hp.getMochila1().getListaObjetos()[numVarita].isEncontrado() == true
				&& hp.getMochila1().getListaObjetos()[numDiario].isEncontrado() == false
				&& hp.getMochila1().getListaObjetos()[numEspada].isEncontrado() == false) {
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.print("\u258A\t          \u2588\u2588\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t         \u2588\u2588 \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t        \u2588\u2588  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t       \u2588\u2588   \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t      \u2588\u2588    \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t     \u2588\u2588     \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t    \u2588\u2588      \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t   \u2588\u2588       \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t  \u2593\u2593        \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t \u2588\u2588         \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t\u2593\u2593          \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A"
					+ "\n\u258A\t    VARITA\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\u258A\n");
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);

		} else if (hp.getMochila1().getListaObjetos()[numVarita].isEncontrado() == false
				&& hp.getMochila1().getListaObjetos()[numDiario].isEncontrado() == false
				&& hp.getMochila1().getListaObjetos()[numEspada].isEncontrado() == false) {
			for (int i = 0; i < filas; i++) {
				System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
				System.out.println(v + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + v);
			}
		}

		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);

		// pociones
		System.out.println("\u258A\t\t   \u2588\u2588\u2588\t\t\t\t\t\t\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t   \u2591\u2591\u2591\t\t\t\t\t     \u2588\u2588\u2588\u2588\u2588 \t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t   \u2591\u2591\u2591\t\t\t\t\t     \u2591\u2591\u2591\u2591\u2591 \t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t   \u2593\u2593\u2593\t\t\t\t\t     \u2591\u2591\u2591\u2591\u2591 \t\t\t\u258A\t\t[1] Ver varita\t\t\t\u258A"
				+ "\n\u258A\t\t \u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t \u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t\u2593\u2593\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\u2593\u2593\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t\u2593\u2593\u2593\u2588\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2593\u2593\u2593\t\t\t\u258A\t\t[2] Tomar Beerus\t\t\u258A"
				+ "\n\u258A\t\t\u2593 BEERUS\u2593\t\t\t\t\u2593\u2593\u2588\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2593\u2593\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\tJAGER MEISTERUS\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t\u2593\u2593\u2588\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2593\u2593\t\t\t\u258A\t\t[3] Tomar Jager Meisterus\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t\u2593\u2593\u2588\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2588\u2593\u2593\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t\u2593\u2593\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2593\u2593\t\t\t\u258A\t\t\t\t\t\t\u258A"
				+ "\n\u258A\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\t\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\u2593\t\t\t\u258A\t\t[0] Volver atrás\t\t\u258A"
				+ "\n\u258A\t\tBEERUS x" + CrudMochila.contarPocion(hp.getMochila1().getListaBeerus())
				+ "\t\t\t       JAGERMEISTERUS x" + CrudMochila.contarPocion(hp.getMochila1().getListaJager())
				+ "\t\t\u258A\t\t\t\t\t\t\u258A");
		System.out.println(h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h
				+ h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h + h);

	}

}
