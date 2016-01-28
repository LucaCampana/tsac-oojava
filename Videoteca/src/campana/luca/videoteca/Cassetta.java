package campana.luca.videoteca;

public class Cassetta extends Film {

	public Cassetta(){
		
	}
	
	public Cassetta(int numero, String t, String r, int a, String[] att) {
		super(numero, t, r, a, att);
	}
	
	public float costoNolleggio(){
		int giorniNollegio = getNumeroGiorniNolleggio();
		return giorniNollegio == 0 ? 0 : ((giorniNollegio - 1) * 2) + 1;
	}

}
