package vistas;

import crud.CrudAdivinanza;
import model.Adivinanza;
import model.Mision;

public class vistasMision1 {
	// creado por Pablo Rodríguez
	public static String imprimirFantasma() {
		String go="\u2591",gs="\u2593", v="\u258A" ;
		
		return 	 
			  v+"\t\t\t\t\t\t\t\t\t\t\t     "+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+      "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t    "+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+    "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t    "+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+  "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t    "+go+go+gs+gs+gs+gs+gs+gs+gs+go+go+go+go+go+go+gs+gs+gs+gs+gs+gs+gs+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+gs+gs+gs+gs+gs+gs+gs+go+go+go+go+go+go+gs+gs+gs+gs+gs+gs+gs+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+go+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+go+go+go+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+go+go+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+go+gs+go+gs+gs+gs+gs+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+go+gs+go+gs+go+go+go+go+go+gs+go+go+go+go+go+go+go+go+go+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+go+go+go+go+go+go+go+go+go+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+      "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t     	 "+go+go+go+go+go+go+gs+go+go+go+go+go+go+go+go+go+go+go+go+              "\t\t\t  "+v+"\n"+
		/*1*/ v+"\t\t\t\t\t\t\t\t\t\t\t            "+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+                     "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t     	 	"+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+                        "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t     		  "+go+go+go+go+go+go+go+go+go+go+go+go+                              "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t              "+go+go+go+go+go+go+go+go+go+go+go+                                 "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t                 "+go+go+go+go+go+go+go+go+go+go+go+go+                              "\t\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t            "+go+go+go+go+go+go+go+go+go+go+go+go+                                 "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                "+go+go+go+go+go+go+go+go+go+                                      "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                   "+go+go+go+go+go+go+go+                                         "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                     "+go+go+go+go+go+go+                                          "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                       "+go+go+go+go+                                              "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                       "+go+go+go+go+                                              "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                        "+go+go+go+go+                                             "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                      	"+go+go+go+                                               "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                        "+go+go+go+                                                "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                       "+go+go+                                                    "\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                      "+go+                                                        "\t\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t                     "+go+                                                         "\t\t\t\t  "+v+"\n";
	}
	
	// creado por Pablo Rodríguez
	public static String imprimirFilch() {
		String n="\u2588", go="\u2591",gs="\u2593", v="\u258A" ;
		
		return 
			  
			  v+"\t\t\t\t\t\t\t\t\t\t\t    "+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+go+go+go+go+go+go+go+n+n+n+go+go+go+go+go+go+n+n+n+go+go+go+go+go+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+go+go+go+go+go+go+go+n+n+n+go+go+go+go+go+go+n+n+n+go+go+go+go+go+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+go+go+go+go+go+go+go+n+n+n+go+go+go+go+go+go+n+n+n+go+go+go+go+go+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+go+go+go+go+go+go+go+go+go+gs+gs+gs+gs+gs+go+go+go+go+go+go+go+go+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t  "+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t   "+gs+gs+gs+gs+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+go+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t        "+gs+gs+gs+gs+gs+n+n+n+n+gs+gs+gs+gs+gs+gs+"  "+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t       "+gs+gs+gs+gs+gs+gs+n+n+n+n+gs+gs+gs+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t      "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+" "+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t      "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t      "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t      "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t       "+go+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+go+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t        "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t        "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t       "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t       "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t  "+v+"\n"+
			  v+"\t\t\t\t\t\t\t\t\t\t\t        "+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+gs+"\t\t\t\t  "+v+"\n" ;
	}
	// creado por Pablo Rodríguez
	public static String imprimirDialogo1M1() {
		String v="\u258A";
		return v+"\tPeeves:Hola Potter... ¿Me ves?...¿No?\t\t\t\t " +v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
				v+"\tUna pena jijiji... \t\t\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
	// creado por Pablo Rodríguez
	public static String imprimirDialogo2M1() {
		String v="\u258A";
		return v+"\tPeeves:Si deseas tu varita los huevos no me debes de tocar\t " +v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
			   v+"\tTócaselos a Filch o una adivinanza deberás acertar. \u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
	// creado por Pablo Rodríguez
	public static String imprimirDialogoPutFilch() {
		String v="\u258A";
		return v+"\tFilch:Illo Potter, las cosas como son, \t\t\t\t " +v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
				v+"\teres un tirao, un chaquetero\t\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
	//Creado por Esperanza Macarena Escacena Morcillo
	public static String imprimirOpcionesM1() {
		String v="\u258A";
		return v+"\t [1] Reventarle un globo con Fairy y agua helada en la cara.\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
			   v+"\t [2] Resolver adivinanza.     \t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
	//Creado por Esperanza Macarena Escacena Morcillo
	public static String imprmirAdivinanza(Adivinanza a) {
		String v="\u258A";
		return v+"\tPeeves: Si fallas te atravesaré, no será de tu agrado ¡jajaja!\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
			   a.getPregunta()+"\n"+
			   v+"\t[1]"+a.getListaRespuestas()[0].getResp()+"\t  [2]"+a.getListaRespuestas()[1].getResp()+"\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
			   v+"\t[3]"+a.getListaRespuestas()[2].getResp()+"\t  [4]"+a.getListaRespuestas()[3].getResp()+"\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
	//Creado por Esperanza Macarena Escacena Morcillo
	public static String acertarAdivinanza(int numRespuesta, Adivinanza a, Mision m) {
		String v="\u258A",impresion;
		if(CrudAdivinanza.comprobarRespuesta(a, numRespuesta)==true) {
			impresion=(v+"\tPeeves: ¡Respuesta correcta!\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
					 v+"\tTu varita y 1 POCIÓN de la casa a mi salud\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v);
		}else {
			impresion=(v+"\tPeeves: Respuesta incorrecta.\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
					   v+"\t¡Qué pena!¡Jajaja!( -"+m.getM().getDano()+" puntos de vida)\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v);
		
		}
		return impresion;
	}
	//Creado por Esperanza Macarena Escacena Morcillo.
	public static String pasarMision1() {
		String v="\u258A";

		return v+"\tPeeves: ¡Qué divertido,jajaja!\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
				   v+"\tTu varita y 1 POCIÓN de la casa a mi salud\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
	
	//Creado por TODOS en clase:
	public static String imprimirEgg() {
		String v="\u258A";

		return v+"\tPeeves: ¡Qué cachondo eres...!\t\t\t\t\t "+v+"\t\t\t\t\t\t\t\t  "+v+"\n"+
				   v+"\t1 POCIÓN extra de la casa a mi salud\t\t\t\u21b5 Intro\t "+v+"\t\t\t\t\t\t\t\t  "+v;
	}
}
