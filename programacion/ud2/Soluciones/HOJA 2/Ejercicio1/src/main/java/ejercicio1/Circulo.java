package ejercicio1;

public class Circulo {

	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio) {
		this.radio=radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double longitud() {
		return 2*Math.PI*radio;
	}
}
