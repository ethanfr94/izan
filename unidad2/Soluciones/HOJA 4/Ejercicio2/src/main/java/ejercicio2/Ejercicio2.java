package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1=new Coche("1234RET",20);
		Coche c2=new Coche("4567KKK");
		c2.frenar(10);
		System.out.println("el coche 2 despues de frenar");
		System.out.println(c2.toString());
		c1.acelera(40);
		c1.acelera(40);
		c1.acelera(40);
		c1.acelera(40);
		
		 //  se puede sustituir por
		 //  for(int i=0;i<5;i++)
         //   c1.acelera(40);
        
				
		System.out.println("el coche 1 despues de acelerar");
		System.out.println(c1.toString());
		System.out.println("Las 3 ultimas letras del coche"+c1);
		System.out.println(c1.letras());
	}

}
