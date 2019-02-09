package org.lasencinas.cotxox.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.lasencinas.cotxox.carrera.Carrera;
import org.lasencinas.cotxox.tarifa.Tarifa;

public class TarifaTest {

	Carrera carrera = new Carrera();



	@Test
	public void comprobarTarifaTiempoEsperado() {
		int tiempoEsperado = 10;
		double totalEsperado = 3.5;
		carrera.setTiempoEsperado(tiempoEsperado);
		Tarifa.calcularCosteTiempo(carrera);

		assertEquals(totalEsperado, Tarifa.getCosteTiempo(), 0.01);

	}

	@Test
	public void comprobarTarifaDistanciaEsperada() {
		double distanciaEsperada = 7.75;
		double totalEsperado = 10.46;
		carrera.setDistancia(distanciaEsperada);
		Tarifa.calcularCosteDistancia(carrera);

		assertEquals(totalEsperado, Tarifa.getCosteDistancia(), 0.01);

	}

	@Test
	public void comprobarTarifaTotalEsperado() {
		double distanciaEsperada = 7.75;
		int tiempoEsperado = 10;
		double costeMilla = 1.35;
		double costeMinuto = 0.35;
		double totalCosteEsperado = distanciaEsperada * costeMilla + tiempoEsperado * costeMinuto;
		carrera.setDistancia(distanciaEsperada);
		carrera.setTiempoEsperado(tiempoEsperado);
		Tarifa.calcularCosteDistancia(carrera);
		Tarifa.calcularCosteTiempo(carrera);
		Tarifa.calcularCosteTotalEsperado();
		assertEquals(totalCosteEsperado, Tarifa.getCosteTotalEsperado(), 0.01);
	}
	@Test
	public void comprobarTarifaMinima() {
		int tarifaMinimaEsperada = 5;
		double distanciaEsperada = 3;
		int tiempoEsperado = 1;
		carrera.setDistancia(distanciaEsperada);
		carrera.setTiempoEsperado(tiempoEsperado);
		Tarifa.calcularCosteDistancia(carrera);
		Tarifa.calcularCosteTiempo(carrera);
		Tarifa.calcularCosteTotalEsperado();
		assertEquals(tarifaMinimaEsperada, Tarifa.getCosteTotalEsperado(), 0.01);
		
	}

}
