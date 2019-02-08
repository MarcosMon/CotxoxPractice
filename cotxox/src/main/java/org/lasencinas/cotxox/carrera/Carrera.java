package org.lasencinas.cotxox.carrera;

public class Carrera {
	private String tarjetaCredito = "";
	private String destino = null;
	private double distancia;
	private String origen;

	public Carrera() {

	}

	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;

	}
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;

	}

	public double getDistancia() {
		
		return this.distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
		
	}

	public void setOrigen(String origen) {
		this.origen = origen;
		
	}

	public String getOrigen() {
		
		return this.origen;
	}

}
