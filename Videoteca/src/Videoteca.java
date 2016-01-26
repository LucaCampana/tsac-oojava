
public class Videoteca {

	private Film [] films;
	
	public Videoteca(Film [] films){
		this.films = films;
	}
	
	public float incassoTotale(){
		float totale = 0;
		for (Film f : films) totale += f.costoNolleggio();
		return totale;
	}
}
