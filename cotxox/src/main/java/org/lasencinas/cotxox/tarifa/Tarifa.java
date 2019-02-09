package org.lasencinas.cotxox.tarifa;

import org.lasencinas.cotxox.carrera.*;

public class Tarifa {
	private double costeMilla = 1.35;
	private double costeMinuto = 0.35;
	private int costeMinimo = 5;
	private double porcentajeComision;
	private double costeTiempoTotal;
	private double costeDistanciaTotal;
	private double costeEsperadoTotal;

	public Tarifa() {

	}

	public Double getCosteDistancia() {
		return this.costeDistanciaTotal;
	}

	public Double getCosteTiempo() {
		return this.costeTiempoTotal;
	}

	public double getCosteTotalEsperado() {
		return this.costeEsperadoTotal;
	}

	public void setCosteDistancia(double costeDistancia) {
		this.costeDistanciaTotal = costeDistancia;
	}

	public void setCosteTiempo(double costeTiempo) {
		this.costeTiempoTotal = costeTiempo;
	}

	public void setCosteTotalEsperado(double costeTotalEsperado) {
		if (costeTotalEsperado >= 5) {

			this.costeEsperadoTotal = costeTotalEsperado;
		} else {
			this.costeEsperadoTotal = 5;
		}
	}

	public void calcularCosteTiempo(Carrera carrera) {
		setCosteTiempo(carrera.getTiempoEsperadoMinutos() * costeMinuto);
	}

	public void calcularCosteDistancia(Carrera carrera) {
		setCosteDistancia(carrera.getDistancia() * costeMilla);
	}

	public void calcularCosteTotalEsperado() {
		setCosteTotalEsperado(getCosteTiempo() + getCosteDistancia());

	}

}
