package test;

import static org.junit.Assert.*;

import campana.luca.harbour.Aereo;
import campana.luca.harbour.Gioco;
import campana.luca.harbour.Invasore;
import campana.luca.harbour.PortoNavale;
import campana.luca.harbour.Sottomarino;

public class GiocoTest {

	@org.junit.Test
	public void test() {
		Gioco g = new Gioco(new PortoNavale("Oh", 16, 2000));
		Aereo a = new Aereo(123123, "dijnerj", 3, 3);
		Sottomarino s = new Sottomarino(883838, "jnfjnifsjni", 10, 3);
		Invasore [] invasori = {a, s};
		int attacchi = 0;
		while (!g.portoDistrutto()){
			attacchi ++;
			g.assalto(invasori);
		}
		System.out.println("Porto distrutto in " + attacchi + " attacchi");
		assertTrue(g.portoDistrutto());
	}

}
