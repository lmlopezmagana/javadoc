package vistas;

import controller.ComprobarOpciones;
import controller.Leer;
import model.Hechizo;
import model.PerPpal;

public class PrintVarita {
	//todo creado por Esperanza Macarena Escacena Morcillo
	
	public static void imprimirPlantillaVarita( PerPpal hp, Hechizo []lista){
		String h = "\u2586";
		String v="\u258A";
		int longWord=12,filasBlanco=12;
		System.out.println(
				h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+
				"\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v+
				"\n"+v+"\t\t\t\t\t\t\t\t  VARITA \t\t\t\t\t\t\t\t"+v+
				"\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v+
				"\n"+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+
				"\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
		
		for(int i=0;i<hp.getV().getH1().length;i++) {
			if(hp.getV().getH1()[i].getNombre().length()>=longWord) {
				System.out.println(v+"\t\t\t\t\t["+(i+1) + "] " +hp.getV().getH1()[i].getNombre()+"\t\t\t\t Daño: "+hp.getV().getH1()[i].getDano()+"\t\t\t\t\t"+v+
								   "\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
			}else {
				System.out.println(v+"\t\t\t\t\t["+(i+1)+ "] " +hp.getV().getH1()[i].getNombre()+"\t\t\t\t\t Daño: "+hp.getV().getH1()[i].getDano()+"\t\t\t\t\t"+v+
								   "\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
			}
		}
		System.out.println(
				h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+
				"\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v+
				"\n"+v+"\t\t\t\t\t\t\t    HECHIZOS APRENDIDOS    \t\t\t\t\t\t\t"+v+
				"\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v+
				"\n"+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+
				"\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
		
		for(int i=0;i<lista.length;i++) {
			
			if(lista[i].isAprendido()==true) {
				if(lista[i].getNombre().length()>=longWord) {	
				System.out.print(v+"\t\t\t\t\t["+(i+1) + "] "+lista[i].getNombre()+"\t\t\t\t Daño: "+lista[i].getDano()+"\t\t\t\t\t"+v);
				System.out.println("\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
				}else {
					System.out.println(v+"\t\t\t\t\t["+(i+1)+ "] "+lista[i].getNombre()+"\t\t\t\t\t Daño: "+lista[i].getDano()+"\t\t\t\t\t"+v+
							   "\n"+v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
				}
				
				filasBlanco-=2;
			}
		}
		if(filasBlanco>0) {
			for(int i=0;i<filasBlanco;i++) {
				System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
			}
		}
		
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
	
	}
	
	public static void imprimirVaritaOpciones() {
		String v="\u258A";
		String h = "\u2586";
		System.out.println(v+"\t\t\t\t\t\t[1] Para cargar nuevo hechizo en la varita.\t\t\t\t\t\t"+v);
		System.out.println(v+"\t\t\t\t\t\t[0] Volver atrás.\t\t\t\t\t\t\t\t\t"+v);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);

	}
	public static void imprimirError() {
		String v="\u258A";
		String h = "\u2586";
		System.out.println(v+"\t\t\t\t\t\t\tTecla incorrecta. Pulse \u21b5 Intro\t\t\t\t\t\t\t"+v);
		
		System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);

	}
	public static void cargarVarita(PerPpal hp, Hechizo []lista) {
		String v="\u258A";
		String h = "\u2586";
		imprimirPlantillaVarita(hp, lista);
		System.out.println(v+"\t\t\t\t     Selecciona el número del hechizo que quieres cambiar en tu varita.\t\t\t\t\t"+v);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);

	}
	
	public static void elegirHechizo(PerPpal hp, int numElegido, Hechizo []lista) {
		String v="\u258A";
		String h = "\u2586";
		int longWord=12;

		
			imprimirPlantillaVarita(hp, lista);
			if(hp.getV().getH1()[numElegido-1].getNombre().length()>=longWord) {
				System.out.println(v+"\t\t\t\t\t\tVas a cambiar el hechizo: "+hp.getV().getH1()[numElegido-1].getNombre() +"\t\t\t\t\t\t"+v);
			}else {
				System.out.println(v+"\t\t\t\t\t\tVas a cambiar el hechizo: "+hp.getV().getH1()[numElegido-1].getNombre() +"\t\t\t\t\t\t\t"+v);
	
			}
			
			System.out.println(v+"\t\t\t\t\tSelecciona el número del hechizo deseado de la lista de hechizos aprendidos.\t\t\t"+v);
			
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
			System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
		

	}
	
	
	public static void avisarOpcionIncorrecta(int numElegido,PerPpal hp) {
		String v="\u258A";
		String h = "\u2586";
		String siguiente=" ",intro="";
	
		if(ComprobarOpciones.avisarTeclaVarita(numElegido,hp.getV().getH1())==false) {
			do {
			
				System.out.println(v+"\t\t\t\t\tNúmero incorrecto, vuelva a introducir el número.\t\t\u21b5 Intro\t\t\t\t"+v);
				System.out.println(v+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+v);
				System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
				siguiente=Leer.dato();
			}while(!siguiente.equals(intro));
		}
	
	}
}
