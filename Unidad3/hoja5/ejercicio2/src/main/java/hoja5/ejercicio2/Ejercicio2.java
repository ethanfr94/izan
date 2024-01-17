/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja5.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
          
        Scanner t =new Scanner (System.in);
        System.out.println("introduce el numero de filas");
        int filas = t.nextInt();
        
        for (int x = 1; x <= filas; x++){
            if (x % 2 == 0){
                System.out.println("987654321");
            }else {
                System.out.println("123456789");
            }
        }
    }
}
