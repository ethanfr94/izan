/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        float r;
        float h;
        Scanner teclado=new Scanner(System.in);
        final double PI=3.14;
        System.out.println("introduce altura: ");
        h=teclado.nextFloat();
        System.out.println("introduce radio: ");
        r=teclado.nextFloat();
        float al=(float) (2*PI*r*h);
        float v=(float) (PI*(r*r)*h);
        System.out.println("el area lateral del cilindro es: "+al);
        System.out.println("el volumen del cilindro es: "+v);
    }
}
