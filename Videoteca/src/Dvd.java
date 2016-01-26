
public class Dvd extends Film{

	public Dvd(int numero, String t, String r, int a, String[] att) {
		super(numero, t, r, a, att);
	}
	
	public float costoNolleggio(){
		return numeroGiorniNolleggio <= 2 ? numeroGiorniNolleggio  * 1.5f : ((numeroGiorniNolleggio - 2) * 2) + 3;
	}

}
