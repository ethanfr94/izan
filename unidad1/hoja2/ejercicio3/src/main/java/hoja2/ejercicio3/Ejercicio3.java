/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        float precioEuros;
        Scanner teclado= new Scanner(System.in);
        System.out.println("introduce un precio: ");
        precioEuros=teclado.nextFloat();
        
        System.out.printf("\nprecio en euros: "+precioEuros );
        System.out.printf("\nprecio en pesetas: "+precioEuros*166.386);
    }
}
