package campana.luca.videoteca;

public abstract class Film {

	private int numeroGiorniNolleggio;
	private String titolo;
	private String regista;
	private int annoProduzione;
	private String [] attoriPrincipali;
	
	public Film(){
		
	}
	
	public Film(int numero, String t, String r, int a, String [] att){
		numeroGiorniNolleggio = numero;
		titolo = t;
		regista = r;
		annoProduzione = a;
		attoriPrincipali = att;
	}
	
	public abstract float costoNolleggio();

	public int getNumeroGiorniNolleggio() {
		return numeroGiorniNolleggio;
	}

	public void setNumeroGiorniNolleggio(int numeroGiorniNolleggio) {
		this.numeroGiorniNolleggio = numeroGiorniNolleggio;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String[] getAttoriPrincipali() {
		return attoriPrincipali;
	}

	public void setAttoriPrincipali(String[] attoriPrincipali) {
		this.attoriPrincipali = attoriPrincipali;
	}
}
