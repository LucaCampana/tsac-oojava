import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Dipendente d1 = new Dipendente("Cristo", "Dio", "23990sdfjkjhoi");
		Imprenditore i1 = new Imprenditore("Buh","Alemannno","sifij","iuaifbi","ohsdoifjsdf", 250);
		LiberoProfessionista l1 = new LiberoProfessionista("Buh","Bah","iuusifuh","oosjdnfj",250);
		AttivitaCommerciale c1 = new AttivitaCommerciale(new Cliente[]{d1, i1, l1});
		System.out.println(c1.calcolaIncassoTotale());
		assertEquals(875.0f, c1.calcolaIncassoTotale(), 0);
	}

}
