/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        System.out.println("introduce un entero");
        int entero=t.nextByte();
        System.out.println("introduce 1, 2 o 3");
        byte opcion=t.nextByte();
        
        double resultado;
       
                resultado=switch(opcion){
            case 1 -> Math.pow(entero, 2);
            case 2 -> entero*2;
            case 3 -> Math.sqrt(entero);
            default -> 0;
        };
                
               System.out.println("la opcion elegida es: "+opcion+" y el resultado es: "+resultado);
    }
}
