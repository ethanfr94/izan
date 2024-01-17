package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rueda r=new Rueda(30,"Michelin");
        Motor m=new Motor(2000,120);
        Coche c=new Coche(r,r,r,r,m,"Seat Altea","Verde");
        System.out.println(c.mostrarInformacion());
	}

}
