package campana.luca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.commercialista.LiberoProfessionista;

public class LiberoProfessionistaTest {

	@Test
	public void test() {
		LiberoProfessionista l1 = new LiberoProfessionista("Buh","Bah","iuusifuh","oosjdnfj", 870);
		assertEquals(485.0f, l1.calcolaParcella(), 0.01f);
	}

}
