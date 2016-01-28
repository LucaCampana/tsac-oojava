package campana.luca.videoteca;
public class Videoteca {

	private Film [] films;
	
	public Videoteca(){
		
	}
	
	public Videoteca(Film [] films){
		this.films = films;
	}
	
	public float incassoTotale(){
		float totale = 0;
		for (Film f : films) totale += f.costoNolleggio();
		return totale;
	}

	public Film[] getFilms() {
		return films;
	}

	public void setFilms(Film[] films) {
		this.films = films;
	}
	
}
