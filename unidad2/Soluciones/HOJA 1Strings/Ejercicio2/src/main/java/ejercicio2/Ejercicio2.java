package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Pepito", primerApellido="Perez";
		String segundoApellido="Fernández";
		nombre=nombre.concat(" "+primerApellido);
		nombre=nombre.concat(" "+segundoApellido);
		System.out.println(nombre+ " tiene longitud: "+nombre.length());
	}

}
