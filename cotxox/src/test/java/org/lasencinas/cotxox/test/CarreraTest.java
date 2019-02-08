package org.lasencinas.cotxox.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.cotxox.carrera.Carrera;




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
		assertEquals("Magaluf", carrera.getDestino());
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
		carrera.setOrigen("Aeroport Son Sant Joan");
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
		assertEquals(tiempoEsperadoMinutos, carrera.getTiempoEsperado());

	}
	}
	


