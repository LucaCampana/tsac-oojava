package campana.luca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import campana.luca.videoteca.Cassetta;

public class CassettaTest {

	@Test
	public void test() {
		Cassetta c = new Cassetta(12, "innjn", "ijnjdf", 23898, new String[]{""});
		assertEquals(23f, c.costoNolleggio(), 0.01f);
	}

}
