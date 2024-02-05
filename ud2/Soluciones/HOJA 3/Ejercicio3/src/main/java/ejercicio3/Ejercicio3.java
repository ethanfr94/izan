package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Satelite s1=new Satelite();
		
		s1.printPosicion();
		System.out.println("Está en órbita: "+s1.enOrbita());
		s1.variarAltura(18000);
		s1.variarPosicion(35, 120);
		s1.printPosicion();
		System.out.println("Está en órbita: "+s1.enOrbita());
	}

}
