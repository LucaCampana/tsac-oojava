package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Sottomarino extends Invasore {
	
	private int stazza;
	private int nArmamenti;
	
	@Override
	public int potenzaFuoco() {
		return Math.round(((stazza * nArmamenti) * 0.25f));
	}
	
	public int getStazza() {
		return stazza;
	}
	
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}
	
	public int getnArmamenti() {
		return nArmamenti;
	}
	
	public void setnArmamenti(int armamenti) {
		this.nArmamenti = armamenti;
	}
}
