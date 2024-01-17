package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double radio;
		Circulo c1=new Circulo();
		Circulo c2=new Circulo(10);
		System.out.println("Radio: ");
		radio=teclado.nextDouble();
		Circulo c3=new Circulo(radio);
		
		c1.setRadio(5);
		System.out.println("Radio de c1: "+c1.getRadio());
		
		System.out.println("Radio de c3: "+c3.getRadio());
		
		System.out.println("Area de c2: "+c2.area());
		System.out.println("Area de c3: "+c3.area());
		System.out.println("Longitud de c3: "+c3.longitud());
		
		
	}

}
