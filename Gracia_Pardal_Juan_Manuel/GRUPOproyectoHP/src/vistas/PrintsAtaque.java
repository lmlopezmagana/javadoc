package vistas;

import model.Enemigo;
import model.Hechizo;
import model.Monstruo;
import model.PerPpal;

public class PrintsAtaque {
	//Todo creado por Esperanza Macarena Escacena Morcillo.
	public static void imprimirOpcionesAtaque(Hechizo []h) {
		String v="\u258A";
		int longWord=11;
		
		for(int i=0;i<h.length;i++) {
			if(h[i].getNombre().length()<longWord) {
				System.out.println(v+"\t\t ["+(i+1)+"] "+h[i].getNombre() +"\t\t\t Daño: "+h[i].getDano() +"\t\t "+v+"\t\t\t\t\t\t\t\t  "+v);
			}else {
				System.out.println(v+"\t\t ["+(i+1)+"] "+h[i].getNombre() +"\t\t Daño: "+h[i].getDano() +"\t\t "+v+"\t\t\t\t\t\t\t\t  "+v);

			}
		}

		
	}
	
	public static void imprimirAtaque(String  graficos, PerPpal hp,int vidaEnemigo) {
		String h = "\u2586";
		String v="\u258A";
		int diez=10;
		
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
		if(vidaEnemigo<diez) {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+vidaEnemigo +"\t\t\t\t\t\t\t  "+v);
		}else {
		System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+vidaEnemigo +"\t\t\t\t\t\t  "+v);
		}
		System.out.print(graficos);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t Harry Potter ♥"+hp.getVida()+"\t\t\t\t\t  "+v);
		imprimirOpcionesAtaque(hp.getV().getH1());
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);	
	
	}
	
	public static void imprimirAtaqueMons(String  graficos, PerPpal hp,Monstruo m) {
		String h = "\u2586";
		String v="\u258A";
		int diez=10;
		
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
		if(m.getVida()>=diez) {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+m.getVida() +"\t\t\t\t\t\t  "+v);

		}else {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+m.getVida() +"\t\t\t\t\t\t\t  "+v);

		}
		System.out.print(graficos);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t Harry Potter ♥"+hp.getVida()+"\t\t\t\t\t  "+v);
		System.out.println(v+"\t"+m.getRaza() +": Ha atacado.\t\t\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v);//hacer array con aataques en los monstruos;
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);	
	
	}
	public static void imprimirAtaqueEnem(String  graficos, PerPpal hp,Enemigo e) {
		String h = "\u2586";
		String v="\u258A";
		int diez=10;
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
		if(e.getVida()>=diez) {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+e.getVida() +"\t\t\t\t\t\t  "+v);

		}else {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+e.getVida() +"\t\t\t\t\t\t\t  "+v);

		}
		
		System.out.print(graficos);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t Harry Potter ♥"+hp.getVida()+"\t\t\t\t\t  "+v);
		System.out.println(v+"\t"+e.getApellido() +": Ha atacado.\t\t\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v);//hacer array con aataques en los monstruos;
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);	
	
	}
	public static void imprimirDerrotadoEnem(String  graficos, PerPpal hp,Enemigo e) {
		String h = "\u2586";
		String v="\u258A";
		int diez=10;
		
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);
		if(e.getVida()>=diez) {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+e.getVida() +"\t\t\t\t\t\t  "+v);

		}else {
			System.out.println(v+"\t\t\t\t\t\t\t\t\t\tVida :"+e.getVida() +"\t\t\t\t\t\t\t  "+v);

		}		System.out.print(graficos);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t Harry Potter ♥"+hp.getVida()+"\t\t\t\t\t  "+v);
		System.out.println(v+"\tHas derrotado a "+e.getApellido() +".\t\t\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v);//hacer array con aataques en los monstruos;
		System.out.println(v+"\t\t\t\t\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v);
		System.out.println(h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h+h);	
	
	}
}
