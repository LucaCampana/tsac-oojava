package campana.luca.harbour;

public class Gioco {

	private PortoNavale portoNavale;
	
	public Gioco(){
		
	}
	
	public Gioco(PortoNavale portoNavale){
		this.portoNavale = portoNavale;
	}
	
	public void assalto(Invasore [] invasori){
		for (Invasore i : invasori){
			portoNavale.setMetriQuadri(Math.round(portoNavale.getMetriQuadri() - (i.calcolaPotenzaFuoco() * 1.5f)));
		}
	}
	
	public boolean portoDistrutto(){
		return portoNavale.getMetriQuadri() <= 0;
	}

	public PortoNavale getPortoNavale() {
		return portoNavale;
	}

	public void setPortoNavale(PortoNavale portoNavale) {
		this.portoNavale = portoNavale;
	}
}
