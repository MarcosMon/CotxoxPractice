package org.lasencinas.cotxox.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.cotxox.carrera.Carrera;
import org.lasencinas.cotxox.tarifa.Tarifa;

public class CarreraTest {
	private Carrera carrera = null;

	@Before
	public void init() {
		carrera = new Carrera();
	}

	@Test
	public void ComprobarDestino() {
		carrera = new Carrera();
		String destino = "Magaluf";
		carrera.setDestino(destino);
		assertEquals(destino, carrera.getDestino());
	}

	@Test
	public void ComprobarDistancia() {
		carrera = new Carrera();
		double distancia = 7.75;
		carrera.setDistancia(distancia);
		assertEquals(distancia, carrera.getDistancia(), 0.00);
	}

	@Test
	public void ComprobarOrigen() {
		carrera = new Carrera();
		String origen = "Aeroport Son Sant Joan";
		carrera.setOrigen(origen);
		assertEquals(origen, carrera.getOrigen());
	}

	@Test
	public void comprobarTarjetaCredito() {
		String tarjetaCredito = "4916119711304546";
		carrera = new Carrera(tarjetaCredito);
		assertEquals(tarjetaCredito, carrera.getTarjetaCredito());
	}

	@Test
	public void comprobarTiempoEsperado() {
		int tiempoEsperadoMinutos = 10;
		carrera = new Carrera();
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		assertEquals(tiempoEsperadoMinutos, carrera.getTiempoEsperadoMinutos());

	}

	@Test
	public void comprobarCosteEsperado() {

		carrera = new Carrera();
		double costeEsperado = 13.96;
		carrera.setDistancia(7.75);
		carrera.setTiempoEsperado(10);
		assertEquals(costeEsperado, carrera.getCosteEsperado(), 0.01);

	}

	@Test
	public void comprobarCosteMinimoEsperado() {
		carrera = new Carrera();
		byte costeEsperado = 5;
		carrera.setDistancia(2);
		carrera.setTiempoEsperado(1);
		assertEquals(costeEsperado, carrera.getCosteEsperado(), 0.01);
	}
	@Test
	public void comprobarPropina() {
		carrera = new Carrera();
		byte propinaEsperada = 2;
		carrera.setPropinas(2);
		assertEquals(propinaEsperada, carrera.getPropinas(), 0.01);
	}
	@Test
	public void comprobarTiempoCarrera() {
		carrera = new Carrera();
		int tiempoCarrera = 17;
		carrera.setTiempoCarrera(tiempoCarrera);
		assertEquals(tiempoCarrera, carrera.getTiempoCarrera(), 0.01);
	}
	@Test
	public void comprobarCosteTotal() {
		carrera = new Carrera();
		int costeTotal = 20;
		carrera.setCosteTotal(costeTotal);
		assertEquals(costeTotal, carrera.getCosteTotal(), 0.01);
		
	}
	@Test
	public void comprobarRealizarPago() {
		carrera = new Carrera();
		carrera.realizarPago(carrera.getCosteEsperado());
		assertEquals(carrera.getCosteEsperado(), carrera.getCosteTotal(), 0.01);
		
	}
}
