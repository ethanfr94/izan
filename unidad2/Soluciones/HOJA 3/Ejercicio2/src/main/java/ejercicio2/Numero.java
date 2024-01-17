/**
 * 
 */
package ejercicio2;

/**
 * @author Nuria
 *
 */
public class Numero {
	private int num;
	
	public Numero() {
		num=0;
	}
	

	public Numero(int num) {
		super();
		this.num = num;
	}
	
	public void aniade(int valor) {
		num=num+valor;
	}
	
	public void resta(int valor) {
		num=num-valor;
	}


	public int getNum() {
		return num;
	}
	
	public int doble() {
		return num*2;
	}
	
	public int triple() {
		return num*3;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
