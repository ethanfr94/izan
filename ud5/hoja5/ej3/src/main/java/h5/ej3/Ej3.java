/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h5.ej3;

/**
 *
 * @author DAM122
 */
public class Ej3 {

    public static void main(String[] args) {
        Contacto c1 = new Contacto( "pepe", "saiz", "123456789", "pepe@gmail.com");
        Contacto c2 = new Contacto( "jose", "diaz", "987654321", "jose@gmail.com");
        
        Agenda a = new Agenda(5);
        
        
        a.insertar(c1);
        a.insertar(c2);
        a.insertar(c1);
        a.insertar(c2);
        
        
        a.buscar("pepe");
        a.eliminar("pepe");
        System.out.println(a.toString());
        
        
        a.ordenar();
        System.out.println(a.toString());
    }
}
