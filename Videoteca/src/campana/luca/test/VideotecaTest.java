package campana.luca.test;
import static org.junit.Assert.*;

import campana.luca.videoteca.Bluray;
import campana.luca.videoteca.Cassetta;
import campana.luca.videoteca.Dvd;
import campana.luca.videoteca.Film;
import campana.luca.videoteca.Videoteca;

public class VideotecaTest {

	@org.junit.Test
	public void test() {
		Dvd d = new Dvd(3, "innjn", "ijnjdf", 23898, new String[]{""});
		Cassetta c = new Cassetta(3, "innjn", "ijnjdf", 23898, new String[]{""});
		Bluray b = new Bluray(1, "innjn", "ijnjdf", 23898, new String[]{""});
		Videoteca v = new Videoteca(new Film[]{d, c, b});
		assertEquals(11f, v.incassoTotale(), 0.01f);
	}

}
