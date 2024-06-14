package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String cadena=teclado.nextLine();
        String mediaCadena=cadena.substring(0, cadena.length()/2);
        System.out.println(mediaCadena);
	}

}
