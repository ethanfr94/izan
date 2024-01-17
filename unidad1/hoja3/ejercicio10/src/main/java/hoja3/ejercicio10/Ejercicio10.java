/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("longitud en m");
        float m=teclado.nextFloat();
        
        int cm=(int) (m*100);
        
        System.out.printf("la longitud en cm es "+cm);
    }
}
