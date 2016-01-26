
public class Cassetta extends Film {

	public Cassetta(int numero, String t, String r, int a, String[] att) {
		super(numero, t, r, a, att);
	}
	
	public float costoNolleggio(){
		return numeroGiorniNolleggio == 0 ? 0 : ((numeroGiorniNolleggio - 1) * 2) + 1;
	}

}
