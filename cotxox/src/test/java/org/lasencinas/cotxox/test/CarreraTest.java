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
	

}
