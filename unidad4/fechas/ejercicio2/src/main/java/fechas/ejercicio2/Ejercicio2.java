/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fechas.ejercicio2;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Veterinario v1 = new Veterinario(3);
        
        v1.anadir();
        
        System.out.println("\nClientes de la veterinaria\n");
        System.out.println(v1.mostrar());
        
        System.out.println("\nClientes de la veterinaria mayores de 5 años.\n");
        System.out.println(v1.mayores());
    }
}
