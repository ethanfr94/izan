/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja3.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("introduce una variable a:");
        float a=teclado.nextFloat();
        System.out.println("introduce una variable b:");
        float b=teclado.nextFloat();
        System.out.println("introduce una variable c:");
        float c=teclado.nextFloat();
        System.out.println("introduce una incognita x:");
        float x=teclado.nextFloat();
        
        float y=(float) ((a*Math.pow(x, 2))+(b*x)+c);
        System.out.println("el valor de y en el polinomio de segundo grado y=ax²+bx+c es: "+y);
    }
}
