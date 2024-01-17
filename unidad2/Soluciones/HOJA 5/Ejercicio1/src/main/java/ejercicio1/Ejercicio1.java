package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurante r1=new Restaurante(10,20);
		System.out.println("Numero de platos: "+r1.getNumPlatos());
		System.out.println("Sirve plato: "+ r1.sirvePlato());
		System.out.println("Numero de platos disponibles: "+r1.getNumPlatos());
		System.out.println("Quedan "+r1.getHuevos()+" huevos");
		System.out.println("Quedan "+r1.getChorizo()+ "kilos de chorizo");
		System.out.println("Aumentamos 12 huevos ");
		r1.addHuevos(1);
		System.out.println("Quedan "+r1.getHuevos()+" huevos");
		System.out.println("Aumentamos 10 kilos de chorizo");
		r1.addChorizo(10);
		System.out.println("Quedan "+r1.getChorizo()+ "kilos de chorizo");
		System.out.println("Numero de platos disponibles: "+r1.getNumPlatos());
		
	}

}
