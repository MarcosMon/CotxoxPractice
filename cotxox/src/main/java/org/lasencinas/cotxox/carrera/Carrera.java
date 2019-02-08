package org.lasencinas.cotxox.carrera;

public class Carrera {
	private String tarjetaCredito = "";
	private String destino = null;

	public Carrera() {

	}

	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;

	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;

	}

}
