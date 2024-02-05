package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Alimento jamon=new Alimento("Jamon York",33,12,true);
	        
	        System.out.println("Datos del jamón: ");
	        System.out.println(jamon.toString());
	        System.out.printf("Calorias: %.2f\n",jamon.calorias(100));
	        if(jamon.esDietetico()){
	            System.out.println("El jamón es dietetico");
	        }else{
	            System.out.println("El jamón no es dietetico");
	        }
	}

}
