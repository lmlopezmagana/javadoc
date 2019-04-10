package model;

public class Respuesta {
	//Creado por Pablo Rodríguez.
	private String resp;
	private boolean correcto;
	
	public Respuesta() {
		
	}

	public Respuesta(String resp, boolean correcto) {
		super();
		this.resp = resp;
		this.correcto = correcto;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

	@Override
	public String toString() {
		return "Respuesta [resp=" + resp + ", correcto=" + correcto + "]";
	}
	
	

}
