package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo t1= new Triangulo(2,5,6);
        System.out.println(t1.perimetro());

        if (t1.esIsosceles()) {
            System.out.println("Es isosceles");
        }else{
            System.out.println("No es isosceles");
        }
        if (t1.esEquilatero()==true) {
            System.out.println("Es equilatero");
        }else{
            System.out.println("No es equilatero");
        }
	}

}
