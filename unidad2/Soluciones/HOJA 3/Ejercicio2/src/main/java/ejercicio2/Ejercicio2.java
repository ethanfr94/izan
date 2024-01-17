package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numero n1=new Numero();
		Numero n2=new Numero(5);
		
		System.out.println("Numero n1: "+n1.getNum());
		n1.aniade(3);
		System.out.println("Numero n1 despues de añadir 3: "+n1.getNum());
		n1.resta(2);
		System.out.println("Numero n1 despues de restar 2: "+n1.getNum());
		System.out.println("Doble de n1: "+n1.doble());
		System.out.println("Triple de n1: "+n1.triple());
		
		System.out.println("Numero n2: "+n2.getNum());
		n2.aniade(6);
		System.out.println("Numero n2 despues de añadir 6: "+n2.getNum());
		n2.resta(4);
		System.out.println("Numero n2 despues de restar 4: "+n2.getNum());
		System.out.println("Doble de n2: "+n2.doble());
		System.out.println("Triple de n2: "+n2.triple());
	}

}
