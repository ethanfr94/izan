package ejercicio4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena=teclado.nextLine();
        cadena=cadena.replaceAll(" es ", " no por ");
        System.out.println(cadena);
	}

}
