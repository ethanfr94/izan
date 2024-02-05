/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduce una distancia en mm:");
        float a=teclado.nextFloat();
        System.out.println("introduce una distancia en cm:");
        float b=teclado.nextFloat();
        System.out.println("introduce una distancia en m:");
        float c=teclado.nextFloat();
        float x=(float) ((a*0.1)+b+(c*100));
        System.out.println("la suma de las 3 distancias es: "+x);
    }
}
