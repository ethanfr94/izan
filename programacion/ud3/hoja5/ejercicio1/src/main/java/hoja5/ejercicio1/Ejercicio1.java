/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
       
        
        Scanner t =new Scanner (System.in);
        System.out.println("introduce el numero de filas de la piramide");
        int filas = t.nextInt();
        
        for(int i = 1; i <= filas; i++){
        //espacios en blanco
            for(int b = 1; b <= filas-i; b++){
                System.out.print(" ");
            }
        //asteriscos    
            for (int x = 1; x<=2*i-1; x++){
                System.out.print("*");
            }
        //nueva linea tras cada fila
            System.out.println("");
        }    
    }
}
