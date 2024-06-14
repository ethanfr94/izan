package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CajaAhorro caja1=new CajaAhorro();
		caja1.depositar(100);
		System.out.println("Saldo despues del deposito: "+caja1.obtenerSaldo());
		caja1.girar(50);
		System.out.println("Saldo despues del giro: "+caja1.obtenerSaldo());
		System.out.println("Transacciones hechas: "+caja1.obtenerTransacciones());
		
		CajaAhorro caja2=new CajaAhorro(200);
		
		System.out.println("Saldo de caja2: "+caja2.obtenerSaldo());
		System.out.println("Transacciones de caja2: "+caja2.obtenerTransacciones());
	}

}
