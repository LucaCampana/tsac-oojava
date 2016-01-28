package campana.luca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.videoteca.Dvd;

public class DvdTest {

	@Test
	public void test() {
		Dvd d = new Dvd(5, "innjn", "ijnjdf", 23898, new String[]{""});
		assertEquals(9f, d.costoNolleggio(), 0.01f);
	}

}
