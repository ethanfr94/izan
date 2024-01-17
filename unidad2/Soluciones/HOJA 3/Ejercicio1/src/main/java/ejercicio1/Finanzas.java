package ejercicio1;

public class Finanzas {
	private double cambio;
	
	public Finanzas() {
		cambio=1.36;
	}
	
	public Finanzas(double cambio) {
		this.cambio=cambio;
	}
	
	public double dolaresToEuros(double dolares) {
		return dolares/cambio;
	}
	
	public double eurosToDolares(double euros) {
		return euros*cambio;
	}
}
