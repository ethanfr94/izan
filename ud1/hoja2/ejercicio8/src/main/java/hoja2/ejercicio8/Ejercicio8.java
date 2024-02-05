/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio8;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        
        float r, l ,a;
        
        System.out.println("introduce un radio");
        
        r=teclado.nextFloat();
        
        a=(float) ((Math.pow(r, 2))*Math.PI);
        l=(float) (Math.PI*(2*r));
        
        System.out.println("el area es: "+a);
        System.out.println("la longitud es: "+l);
    }
}
