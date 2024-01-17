package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Taller t=new Taller(5,50);
		 System.out.println("Cambios completos: "+t.getCambioCompletos());
		 System.out.println("Cambios parciales: "+t.getCambioParcial());
		 if(t.cambioCompleto()){
             System.out.println("Se hizo el cambio completo");
         }else{
             System.out.println("No se hizo cambio completo");
         }
		 if(t.cambioParcial()){
             System.out.println("Se hizo el cambio parcial");
         }else{
             System.out.println("no se hizo el cambio parcial");
         }
		 System.out.println("Numero de ruedas: "+t.getRuedas());
		 System.out.println("Litros de aceite: "+t.getAceite());
		 System.out.println(t.toString());
		 
		 Taller t2=new Taller(t);
		 System.out.println("Datos del segundo taller");
		 System.out.println(t2.toString());
	}

}
