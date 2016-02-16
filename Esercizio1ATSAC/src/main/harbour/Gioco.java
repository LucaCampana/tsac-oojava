package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {

	private Porto porto;
	
	public Gioco(Porto p){
		this.porto = p;
	}
	
	public void attacco(Invasore [] invasori){
		int sum = 0;
		for (Invasore i : invasori) sum += i.potenzaFuoco();
		this.porto.addMetriQuadriDistrutti(sum * 2.5);
	}
	
	public boolean portoDistrutto(){
		return porto.getDimensioneSqMetersNonDistrutta() == 0;
	}
}
