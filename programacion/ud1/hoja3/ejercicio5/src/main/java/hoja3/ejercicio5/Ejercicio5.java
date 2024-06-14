/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduce una cantidad de segundos:");
        int seg=teclado.nextInt();
        int min;
        int hora;
        min=seg/60;
        hora=min/60;
        int rseg=seg%60;
        int rmin=min%60;
        System.out.println("la cantidad en segundos "+seg+" es igual a "+hora+":"+rmin+":"+rseg);
    }
}
