/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja4.ejercicio3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Monedero m=new Monedero(20);
        
        System.out.println("dinero: "+m.getDinero()+"€");
        
        m.guardar(10.4F);
        System.out.println("dinero: "+m.getDinero()+"€");
        
        m.sacar(50);
        System.out.println("dinero: "+m.getDinero()+"€");
        
        m.sacar(20);
        System.out.println("dinero: "+m.getDinero()+"€");
        
    }
}
