
public class Dipendente extends Cliente{
		
	public Dipendente(String nome, String cognome, String codiceFiscale){
		super(nome, cognome, codiceFiscale);
	}
	
	public float calcolaParcella(){
		return 50f;
	}
}
