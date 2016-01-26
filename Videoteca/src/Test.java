import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		Dvd d = new Dvd(3, "innjn", "ijnjdf", 23898, new String[]{""});
		Cassetta c = new Cassetta(3, "innjn", "ijnjdf", 23898, new String[]{""});
		Bluray b = new Bluray(2, "innjn", "ijnjdf", 23898, new String[]{""});
		Videoteca v = new Videoteca(new Film[]{c});
		System.out.println(v.incassoTotale());
	}

}
