package campana.luca.harbour;

public class Sottomarino extends Invasore {

	private int armamenti;
	private int stazza;
	
	public Sottomarino(){
		
	}
	
	public Sottomarino(int codiceIdentificativo, String modello, int armamenti, int stazza) {
		super(codiceIdentificativo, modello);
		this.armamenti = armamenti;
		this.stazza = stazza;
	}
	
	public int calcolaPotenzaFuoco(){
		return armamenti * stazza;
	}

	public int getArmamenti() {
		return armamenti;
	}

	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

}
