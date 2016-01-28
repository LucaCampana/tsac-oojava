package test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.harbour.Aereo;

public class AereoTest {

	@Test
	public void test() {
		Aereo a = new Aereo(7373, "Ah!", 10, 3);
		assertEquals(175, a.calcolaPotenzaFuoco());
	}
}
