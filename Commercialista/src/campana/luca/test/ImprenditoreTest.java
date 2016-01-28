package campana.luca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.commercialista.Imprenditore;

public class ImprenditoreTest {

	@Test
	public void test() {
		Imprenditore i1 = new Imprenditore("Buh","Mah","sifij","iuaifbi","ohsdoifjsdf", 120);
		assertEquals(520f, i1.calcolaParcella(), 0.01f);
	}

}
