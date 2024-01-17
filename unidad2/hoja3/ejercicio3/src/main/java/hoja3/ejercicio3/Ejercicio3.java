/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Satelite s1=new  Satelite();
        
        s1.printPosicion();
        System.out.println("en orbita? "+s1.enOrbita());
        s1.variarPosicon(150, 254);
        s1.variarAltura(17252);
        s1.printPosicion();
        System.out.println("en orbita? "+s1.enOrbita());
    
    
    
    
    }
}
