package campana.luca.videoteca;

public class Bluray extends Film{

	public Bluray(){
		
	}
	
	public Bluray(int numero, String t, String r, int a, String[] att) {
		super(numero, t, r, a, att);
	}
	
	public float costoNolleggio(){
		int giorniNollegio = getNumeroGiorniNolleggio();
		if (giorniNollegio == 0) return 0;
		float costo = 1f;
		for (int i = 0; i < giorniNollegio - 1; i++){
			costo += costo * (1 + (0.1 * (i + 1)));
		}
		return costo;
	}

}
