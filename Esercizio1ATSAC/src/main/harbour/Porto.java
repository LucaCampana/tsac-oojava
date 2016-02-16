package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Porto {

	private double dimensioneSqMeters;
	private double dimensioneSqMetersNonDistrutta;
	
	public void addMetriQuadriDistrutti(double n){
		this.dimensioneSqMetersNonDistrutta -= n;
		if (this.dimensioneSqMetersNonDistrutta < 0) this.dimensioneSqMetersNonDistrutta = 0;
	}
	
	public double getDimensioneSqMeters() {
		return dimensioneSqMeters;
	}
	
	public void setDimensioneSqMeters(double dimensioneSqMeters) {
		this.dimensioneSqMeters = dimensioneSqMeters;
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMeters;
	}
	
	public double getDimensioneSqMetersNonDistrutta() {
		return dimensioneSqMetersNonDistrutta;
	}
	
	public void setDimensioneSqMetersNonDistrutta(double dimensioneSqMetersNonDistrutta) {
		this.dimensioneSqMetersNonDistrutta = dimensioneSqMetersNonDistrutta;
	}
	
}
