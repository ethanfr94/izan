package ejercicio2;

public class Triangulo {
	private int lado1, lado2, lado3;

	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public boolean esIsosceles() {
		boolean aux = false;
		if ((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado1 != lado3)
				|| (lado1 == lado3 && lado2 != lado3)) {
			aux = true;
		}
		return aux;
	}

	public boolean esEquilatero() {
		boolean aux = false;
		if (lado1 == lado2 && lado1 == lado3) {
			aux = true;
		}
		return aux;
	}

	public boolean esRectangulo() {
		boolean aux = false;
		if (lado1 > lado2 && lado1 > lado3) {
			if ((Math.pow(lado2, 2) + Math.pow(lado3, 2)) == Math.pow(lado1, 2)) {
				aux = true;
			}
		}
		if (lado2 > lado1 && lado2 > lado3) {
			if ((Math.pow(lado1, 2) + Math.pow(lado3, 2)) == Math.pow(lado2, 2)) {
				aux = true;
			}
		}
		if (lado3 > lado2 && lado3 > lado1) {
			if ((Math.pow(lado2, 2) + Math.pow(lado1, 2)) == Math.pow(lado3, 2)) {
				aux = true;
			}
		}
		return aux;
	}

	public double perimetro() {
		double perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
}
