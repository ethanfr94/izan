package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cartas c1=new Cartas();
	        Cartas c2=new Cartas();
	        if (c1.getNumero()>c2.getNumero()){
	            System.out.println(c1.mostrar()+" es mayor que "+c2.mostrar());
	        }else if (c2.getNumero()>c1.getNumero()){
	            System.out.println(c1.mostrar()+" es menor que "+c2.mostrar());
	        }else System.out.println(c1.mostrar()+" es igual que "+c2.mostrar());
	}

}
