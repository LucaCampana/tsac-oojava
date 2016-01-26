
public class Cliente {

	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public Cliente(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}

	public float calcolaParcella(){
		return 0;
	}
}
