package vistas;

public class PrintsMapa {
	
	//Juan Manuel Gracia Pardal
	
	public static void imprimirMapa(String[][]mapa) {

		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < 15; j++) {

				if (mapa[i][j] != null) {
					System.out.print(mapa[i][j]);
				}

			}

		}

	}
		
}
