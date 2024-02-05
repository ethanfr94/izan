package Ejercicio1;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona("nuria","celis","nieto","123456789J");
        System.out.println(p.contrasenia());
        if (p.dniValido()){
            System.out.println("DNI válido");
        }else System.out.println("DNI no válido");
	}

}
