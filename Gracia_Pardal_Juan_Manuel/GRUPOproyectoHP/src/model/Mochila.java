package model;

public class Mochila {
	//Creado por Esperanza Macarena Escacena Morcillo
	
	private Pocion [] listaBeerus;
	private ObjetoMag [] listaObjetos;
	private Pocion[] listaJager;
	public Mochila (Pocion[] listaBeerus,Pocion[] listaJager, ObjetoMag[] listaObjetos) {
		this.listaBeerus = listaBeerus;
		this.listaObjetos = listaObjetos;
		this.listaJager=listaJager;
	}
	public Mochila() {
		
	}
	
	
	public ObjetoMag[] getListaObjetos() {
		return listaObjetos;
	}
	public void setListaObjetos(ObjetoMag[] listaObjetos) {
		this.listaObjetos = listaObjetos;
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
	
}