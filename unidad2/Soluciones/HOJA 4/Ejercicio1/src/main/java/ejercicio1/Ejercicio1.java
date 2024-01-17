package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Circulo c1=new Circulo();
        
        c1.setRadio(6.3f);
       
        System.out.println("Radio del circulo: "+c1.getRadio());
        
        Circulo c2=new Circulo(10);
        System.out.println("Radio del circulo: "+c2.getRadio());
	}

}
