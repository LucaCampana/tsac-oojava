package campana.luca.harbour;

public abstract class Invasore {

	private int codiceIdentificativo;
	private String modello;
	
	public Invasore(){
		
	}
	
	public Invasore(int codiceIdentificativo, String modello){
		this.codiceIdentificativo = codiceIdentificativo;
		this.modello = modello;
	}
	
	public abstract int calcolaPotenzaFuoco();

	public int getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setCodiceIdentificativo(int codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
	
}
