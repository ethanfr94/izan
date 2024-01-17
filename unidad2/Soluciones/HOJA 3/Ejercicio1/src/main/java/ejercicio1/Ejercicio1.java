package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finanzas f=new Finanzas();
		
		Scanner teclado=new Scanner(System.in);
		double dolares, euros;
		
		System.out.println("Introduce dolares: ");
		dolares=teclado.nextDouble();
		euros=f.dolaresToEuros(dolares);
		System.out.println("Son "+euros+" euros");
		
		System.out.println("Introduce euros: ");
		euros=teclado.nextDouble();
		dolares=f.eurosToDolares(euros);
		System.out.println("Son "+dolares+" dolares");
	}

}
