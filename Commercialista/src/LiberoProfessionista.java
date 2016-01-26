
public class LiberoProfessionista extends Cliente{

	private String piva;
	private int fatture;
	
	public LiberoProfessionista(String nome, String cognome, String codiceFiscale, String piva, int fatture) {
		super(nome, cognome, codiceFiscale);
		this.piva = piva;
		this.fatture = fatture;
	}

	public float calcolaParcella(){
		return 50f + (0.5f * fatture);
	}
}
