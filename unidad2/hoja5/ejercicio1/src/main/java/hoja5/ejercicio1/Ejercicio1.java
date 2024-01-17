/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio1;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Restaurante r=new Restaurante(1,1);
        
        System.out.println("nos quedan "+r.getHuevos()+" huevos");
        System.out.println("nos quedan "+r.getChorizo()/1000+" kg chorizo");
        System.out.println("añadimos una docena de huevos y un kg de chorizo");
        r.addHuevos(1);
        r.addChorizo(1);
        
        System.out.println("nos quedan "+r.getHuevos()+" huevos");
        System.out.println("nos quedan "+r.getChorizo()/1000+" kg chorizo");
        System.out.println("podemos servir "+r.getPlatos()+" platos");
        System.out.println("servimos un plato");
        r.sirvePlato();
        
        System.out.println("podemos servir "+r.getPlatos()+" platos");
        System.out.println("nos quedan "+r.getHuevos()+" huevos");
        System.out.println("nos quedan "+r.getChorizo()/1000+" kg chorizo");

        
    }
}
