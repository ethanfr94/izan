/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package h2.ej2;

/**
 *
 * @author DAM122
 */
public class Ej2 {

    public static void main(String[] args) {
    
    Articulo [] art = new Articulo [10];
    Articulo [] per = new Articulo [5];
    Articulo [] prom = new Articulo [5];
    
    for (int i = 0; i < art.length/2; i++){
        System.out.println("introduce un mes de expedicion: ");
        per [i] = new Perecedero(2, 2015, "25-12-2012", "001", "sardinas", 3.99);
    }
    for (int i = 0; i < art.length/2; i++){
        Perecedero per = new Perecedero(2, 2015, "25-12-2012", "001", "sardinas", 3.99);
    }
    for (int i = art.length/2; i < art.length; i++){
        EnPromocion prom = new EnPromocion(0.05, "002", "mejillones", 2.99);
    }
    
    for (int i = 0; i < art.length; i++){
        art[i].datos();
    }
    
        
    
        
        
    }
    
    
}
