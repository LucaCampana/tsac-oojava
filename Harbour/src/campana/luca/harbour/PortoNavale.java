package campana.luca.harbour;

public class PortoNavale {

	private String nome;
	private int numeroImbarcazioni;
	private int metriQuadri;
	
	public PortoNavale(){
		
	}

	public PortoNavale(String nome, int numeroImbarcazioni, int metriQuadri){
		this.nome = nome;
		this.numeroImbarcazioni = numeroImbarcazioni;
		this.metriQuadri = metriQuadri;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroImbarcazioni() {
		return numeroImbarcazioni;
	}

	public void setNumeroImbarcazioni(int numeroImbarcazioni) {
		this.numeroImbarcazioni = numeroImbarcazioni;
	}

	public int getMetriQuadri() {
		return metriQuadri;
	}

	public void setMetriQuadri(int metriQuadri) {
		this.metriQuadri = metriQuadri;
	}
	
	
}
