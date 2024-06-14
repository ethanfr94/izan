package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
        Tarjeta t=new Tarjeta("Nuria","12345678912345678912",500);
        System.out.println(t.getPIN());
        System.out.println("Introduce pin: ");
        String pin=teclado.next();
        t.desbloquea(pin);
        t.pagar(100, pin, "Zapatos", false);
        t.pagar(1000, pin, "mesa", true);
        t.pagar(10, "1111", "silla", true);
        t.pagar(10, pin, "arca", true);
	}

}
