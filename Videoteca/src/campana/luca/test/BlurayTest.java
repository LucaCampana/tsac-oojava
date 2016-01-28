package campana.luca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.videoteca.Bluray;

public class BlurayTest {

	@Test
	public void test() {
		Bluray b = new Bluray(5, "innjn", "ijnjdf", 23898, new String[]{""});
		System.out.println(b.costoNolleggio());
		assertEquals(25.5f, b.costoNolleggio(), 0.01f);
	}

}
