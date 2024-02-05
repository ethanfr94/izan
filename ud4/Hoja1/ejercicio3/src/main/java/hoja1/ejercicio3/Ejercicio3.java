/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja1.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       
        Scanner t = new Scanner (System.in);
        
       int [] numeros = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("introduce un numero");
        int n = t.nextInt();
        //buscamos la posicion de un numero introducido por teclado
        for (int i=0; i<=numeros.length-1;i++){
            if(n == numeros[i]){
                System.out.println("el numero "+n+" esta en la "+(i+1)+"º posicion");
            } else {System.out.println("numero no encontrado");}
        }
        

        
       
    }
}
