package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado =new Scanner(System.in);
	        System.out.println("Introduce la temperatura: ");
	        double temp =teclado.nextDouble();
	        Alarma a=new Alarma(temp);
	        if (a.comprueba()){
	            a.normaliza();
	            System.out.println("Alarma normalizada");
	        }else {System.out.println("Alarma correcta");}
	    }
	    
	}


