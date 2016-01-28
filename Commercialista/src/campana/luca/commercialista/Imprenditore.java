package campana.luca.commercialista;
public class Imprenditore extends Cliente {

	private String piva;
	private String ragioneSociale;
	private int fatture;
	
	public Imprenditore(){
		
	}
	
	public Imprenditore(String nome, String cognome, String codiceFiscale, String piva, String ragioneSociale, int fatture) {
		super(nome, cognome, codiceFiscale);
		this.piva = piva;
		this.ragioneSociale = ragioneSociale;
		this.fatture = fatture;
	}
	
	public float calcolaParcella(){
		return 500 + (fatture - 100);
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getFatture() {
		return fatture;
	}

	public void setFatture(int fatture) {
		this.fatture = fatture;
	}

}
