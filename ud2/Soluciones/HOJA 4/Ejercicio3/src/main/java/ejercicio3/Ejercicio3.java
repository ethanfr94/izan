package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monedero m1=new Monedero(20);
        m1.meterDinero(10.4);
        System.out.println("tienes ="+m1.getCantidad());
        m1.sacarDinero(50);
        System.out.println("tienes ="+m1.getCantidad());
	}

}
