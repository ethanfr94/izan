/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja6.ejercicio1;

/**
 *
 * @author dam1
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Taller t1=new Taller(0,0);
        System.out.println("tenemos "+t1.getCambioCompleto()+" cambios completos o "+t1.getCambioParcial()+" cambios parciales");
       
        System.out.println("tenemos "+t1.getAceite()+" litros de aceite");
       
        System.out.println("tenemos "+t1.getRuedas()+" ruedas");
       
        System.out.println("añdimos una garrafa de aceite y 4 ruedas");
        t1.addAceite(3);
        t1.addRuedas(4);
        System.out.println("tenemos "+t1.getAceite()+" litros de aceite");
        System.out.println("tenemos "+t1.getRuedas()+" ruedas");
       
        System.out.println("tenemos "+t1.getCambioCompleto()+" cambios completos o "+t1.getCambioParcial()+" cambios parciales");
        System.out.println("hacemos un cambio completo");
        t1.cambioCompleto();
       
        System.out.println("tenemos "+t1.getCambioCompleto()+" cambios completos o "+t1.getCambioParcial()+" cambios parciales");
        System.out.println("hacemos un cambio parcial");
        t1.cambioParcial();
       
        System.out.println("tenemos "+t1.getCambioCompleto()+" cambios completos o "+t1.getCambioParcial()+" cambios parciales");
        System.out.println("tenemos "+t1.getAceite()+" litros de aceite");
        System.out.println("tenemos "+t1.getRuedas()+" ruedas");
      
        System.out.println(t1.toString());

    }
}
