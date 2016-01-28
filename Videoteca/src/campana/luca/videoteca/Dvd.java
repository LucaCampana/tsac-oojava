package campana.luca.videoteca;

public class Dvd extends Film{

	public Dvd(){
		
	}
	
	public Dvd(int numero, String t, String r, int a, String[] att) {
		super(numero, t, r, a, att);
	}
	
	public float costoNolleggio(){
		int giorniNollegio = getNumeroGiorniNolleggio();
		return giorniNollegio <= 2 ? giorniNollegio  * 1.5f : ((giorniNollegio - 2) * 2) + 3;
	}

}
