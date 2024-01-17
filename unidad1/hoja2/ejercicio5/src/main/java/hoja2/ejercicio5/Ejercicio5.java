/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hoja2.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio5 {
    public static void main(String[] args) {
             
       float precio;
       final float IVA=0.21f;
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("precio: ");
       precio=teclado.nextFloat();
        System.out.println("el precio sin IVA es: "+precio);
        System.out.println("el precio con IVA es: "+precio*1.21);
        System.out.println("el precio despues de aplicar un porcentaje de 10 de descuento es: "+(precio*1.21)*0.90);

    }
}

