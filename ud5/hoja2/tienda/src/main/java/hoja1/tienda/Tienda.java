/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.tienda;

/**
 *
 * @author usuario
 */
public class Tienda {

    public static void main(String[] args) {
        
        Articulo [] art = new Articulo [10];
        
        art[0] = new Perecederos(2, 2024, "a", 1, 3);
        art[1] = new Perecederos(2, 2023, "b", 2, 3);
        art[2] = new Perecederos(1, 2024, "c", 3, 3);
        art[3] = new Perecederos(2, 2025, "d", 4, 3);
        art[4] = new Perecederos(3, 2024, "e", 5, 3);
        art[5] = new EnPromocion(20, "f", 6, 3);
        art[6] = new EnPromocion(10, "g", 7, 3);
        art[7] = new EnPromocion(10, "h", 8, 3);
        art[8] = new EnPromocion(10, "i", 9, 3);
        art[9] = new EnPromocion(0, "j", 10, 3);
        
        
        for (Articulo art1 : art) {
             System.out.println(art1.toString());
        }
        
        System.out.println(Perecederos.caducados(art));
        System.out.println("");
        System.out.println(EnPromocion.maxdescuento(art));
    }
}
