
public class AttivitaCommerciale {

	private Cliente [] clienti;
	
	public AttivitaCommerciale(Cliente [] clienti){
		this.clienti = clienti;
	}
	
	public float calcolaIncassoTotale(){
		float tot = 0;
		for (Cliente c : clienti) tot += c.calcolaParcella();
		return tot;
	}
}
