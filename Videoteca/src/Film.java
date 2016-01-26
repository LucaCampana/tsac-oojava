
public class Film {

	protected int numeroGiorniNolleggio;
	protected String titolo;
	protected String regista;
	protected int annoProduzione;
	protected String [] attoriPrincipali;
	
	public Film(int numero, String t, String r, int a, String [] att){
		numeroGiorniNolleggio = numero;
		titolo = t;
		regista = r;
		annoProduzione = a;
		attoriPrincipali = att;
	}
	
	public float costoNolleggio(){
		return 0;
	}
}
