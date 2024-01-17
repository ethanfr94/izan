package ejercicio3;

import java.util.Random;

public class Cartas {
	 private int numero;
	    private String palo;

	    public Cartas() {
	        Random r=new Random();
	        numero=r.nextInt(10)+1; 
	        int aux=r.nextInt(4)+1;
	        switch(aux){
	            case 1: palo="Oros";
	                break;
	            case 2: palo="Copas";
	                break;
	            case 3:palo="Espadas";
	                break;
	            case 4: palo="Bastos";
	                break;
	        }//fin del switch
	    }//fin del constructor

	    
	    public String mostrar() {
	        return  numero + " de " + palo;
	    }

	    public int getNumero() {
	        return numero;
	    }

	    public String getPalo() {
	        return palo;
	    }
}
