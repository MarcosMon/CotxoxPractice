package org.lasencinas.cotxox.tarifa;

import org.lasencinas.cotxox.carrera.*;

public class Tarifa {
	private static double costeMilla = 1.35;
	private static double costeMinuto = 0.35;
	private static int costeMinimo = 5;
	private double porcentajeComision;
	private static double costeTiempoTotal;
	private static double costeDistanciaTotal;
	private static double costeEsperadoTotal;

	public Tarifa() {

	}

	public static Double getCosteDistancia() {
		return costeDistanciaTotal;
	}

	public static Double getCosteTiempo() {
		return costeTiempoTotal;
	}

	public static double getCosteTotalEsperado() {
		return costeEsperadoTotal;
	}

	public static void setCosteDistancia(double costeDistancia) {
		Tarifa.costeDistanciaTotal = costeDistancia;
	}

	public static void setCosteTiempo(double costeTiempo) {
		Tarifa.costeTiempoTotal = costeTiempo;
	}

	public static void setCosteTotalEsperado(double costeTotalEsperado) {
		if (costeTotalEsperado >= 5) {

			Tarifa.costeEsperadoTotal = costeTotalEsperado;
		} else {
			
			Tarifa.costeEsperadoTotal = Tarifa.costeMinimo;
		}
	}

	public static void calcularCosteTiempo(Carrera carrera) {
		setCosteTiempo(carrera.getTiempoEsperadoMinutos() * costeMinuto);
	}

	public static void calcularCosteDistancia(Carrera carrera) {
		setCosteDistancia(carrera.getDistancia() * costeMilla);
	}

	public static void calcularCosteTotalEsperado() {
		setCosteTotalEsperado(getCosteTiempo() + getCosteDistancia());

	}

}
