
public class Imprenditore extends Cliente{

	private String piva;
	private String ragioneSociale;
	private int fatture;
	
	public Imprenditore(String nome, String cognome, String codiceFiscale, String piva, String ragioneSociale, int fatture) {
		super(nome, cognome, codiceFiscale);
		this.piva = piva;
		this.ragioneSociale = ragioneSociale;
		this.fatture = fatture;
	}
	
	public float calcolaParcella(){
		return 500 + (fatture - 100);
	}

}
