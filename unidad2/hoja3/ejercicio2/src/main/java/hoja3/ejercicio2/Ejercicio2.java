/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio2;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Numero n1=new Numero();
        Numero n2=new Numero(7);
     
            System.out.println("n1= "+n1.getNum());
        
        n1.suma(2);
            System.out.println("n1 tras sumarle 2= "+n1.getNum());
        
        n1.resta(1);
            System.out.println("n1 tras restarle 1= "+n1.getNum());
        
        
            System.out.println("n2= "+n2.getNum());
        
        n2.setNum(10);
            System.out.println("n2= "+n2.getNum());
        
            System.out.println("doble de n2= "+n2.doble());
        
            System.out.println("triple de n2= "+n2.triple());
        
    }
}
