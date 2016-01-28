package test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.harbour.Aereo;
import campana.luca.harbour.Sottomarino;

public class SottomarinoTest {

	@Test
	public void test() {
		Sottomarino s = new Sottomarino(7373, "Ah!", 10, 3);
		assertEquals(30, s.calcolaPotenzaFuoco());
	}

}
