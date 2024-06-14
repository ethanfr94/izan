package ejercicio1;

public class CajaAhorro {
	private int saldo;
	private int transacciones;
	
	
	
	public CajaAhorro() {
		saldo=0;
		transacciones=0;
	}

	public CajaAhorro(int saldo) {
		this.saldo=saldo;
		transacciones=1;
	}
	
	public void depositar(int cantidad) {
		this.saldo=this.saldo+cantidad;
		transacciones++;
	}
	
	public void girar(int cantidad) {
		this.saldo=saldo-cantidad;
		transacciones++;
	}
	
	public int obtenerSaldo() {
		return saldo;
	}
	
	public int obtenerTransacciones() {
		return transacciones;
	}	

}


