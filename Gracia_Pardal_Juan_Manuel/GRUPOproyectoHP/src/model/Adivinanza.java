package model;

public class Adivinanza {
	//Creado por Pablo Rodríguez.
	private String pregunta;
	private Respuesta [] listaRespuestas;
	
	public Adivinanza() {

	}

	public Adivinanza(String pregunta, Respuesta[] listaRespuestas) {
		super();
		this.pregunta = pregunta;
		this.listaRespuestas = listaRespuestas;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Respuesta[] getListaRespuestas() {
		return listaRespuestas;
	}

	public void setListaRespuestas(Respuesta[] listaRespuestas) {
		this.listaRespuestas = listaRespuestas;
	}

	@Override
	public String toString() {
		return "Adivinanza [pregunta=" + pregunta + "]";
	}
	
	
	
	

}
