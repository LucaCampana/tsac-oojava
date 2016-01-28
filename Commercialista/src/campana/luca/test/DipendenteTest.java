package campana.luca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.commercialista.Dipendente;

public class DipendenteTest {

	@Test
	public void test() {
		Dipendente d1 = new Dipendente("Mah", "Non so", "23990sdfjkjhoi");
		System.out.println(d1.calcolaParcella());
		assertEquals(50f,  d1.calcolaParcella(), 0.01f);
	}

}
