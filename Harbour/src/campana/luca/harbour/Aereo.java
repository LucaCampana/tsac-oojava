package campana.luca.harbour;

public class Aereo extends Invasore {

	private int armamentiAlpha;
	private int armamentiBeta;
	private final int potenzaAlpha = 10;
	private final int potenzaBeta = 25;
	
	public Aereo(){
		
	}
	
	public Aereo(int codiceIdentificativo, String modello, int alpha, int beta) {
		super(codiceIdentificativo, modello);
		this.armamentiAlpha = alpha;
		this.armamentiBeta = beta;
	}
	
	public int calcolaPotenzaFuoco(){
		return armamentiAlpha * potenzaAlpha + armamentiBeta * potenzaBeta;
	}

	public int getArmamentiAlpha() {
		return armamentiAlpha;
	}

	public void setArmamentiAlpha(int armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}

	public int getArmamentiBeta() {
		return armamentiBeta;
	}

	public void setArmamentiBeta(int armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}

	public int getPotenzaAlpha() {
		return potenzaAlpha;
	}

	public int getPotenzaBeta() {
		return potenzaBeta;
	}

}
